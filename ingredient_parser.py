import json
from nltk.corpus import wordnet

recipes_ingredients = json.loads(open("ingredients.json", "r", encoding='UTF-8').read())

for recipe in recipes_ingredients:
    new_ingredients = []
    for ingredients in recipe["ingredients"]:
        words = ingredients["ingredient"].split(" ")
        ingredients.setdefault("foodstuff", '')
        for word in words:
            word = word.strip(",")
            synsets = wordnet.synsets(word)
            for synset in synsets:
                for hypernym in synset.hypernym_paths():
                    for hypernym_synset in hypernym:
                        if 'food' in hypernym_synset.name() or 'foodstuff' in hypernym_synset.name():
                            print(word)
                            if word not in ingredients['foodstuff']:
                                if ingredients['foodstuff'] == '':
                                    ingredients['foodstuff'] = word
                                else:
                                    ingredients['foodstuff'] += ", "+word
                            if word in words:
                                words.remove(word)
                            state = " ".join(words)
                            ingredients["state"] = state
                            break
        new_ingredients.append(ingredients)
    recipe["ingredients"] = new_ingredients


print(recipes_ingredients)

with open("new_ingredients.json", "w", encoding='UTF-8') as output:
    output.write(json.dumps(recipes_ingredients))
    output.close()
