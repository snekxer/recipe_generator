import json
from nltk.corpus import wordnet

recipes_ingredients = json.loads(open("ingredients.json", "r", encoding='UTF-8').read())

# reads json file, which has n recipes with their ingredients and link (no instructions)
for recipe in recipes_ingredients:
    new_ingredients = []
    # gets "ingredients" from the recipe, which has amount, measurement and the (actual) ingredients
    for ingredients in recipe["ingredients"]:
        # gets the actual ingredients and parses them into a list
        words = ingredients["ingredient"].split(" ")
        ingredients.setdefault("foodstuff", '')
        # gets each word in the ingredient description, which has both the food ingredient and the state it's in
        for word in words:
            word = word.strip(",")
            # looks up the synsets of the word and iterates over them
            synsets = wordnet.synsets(word)
            for synset in synsets:
                # gets the inherited hypernyms and iterates over them
                for hypernym in synset.hypernym_paths():
                    # gets each hypernym's synset
                    for hypernym_synset in hypernym:
                        # if any hypernym has 'food' in it (foodstuff, food, food product, etc), its assigned as such
                        if 'food' in hypernym_synset.name() or 'foodstuff' in hypernym_synset.name():
                            if word not in ingredients['foodstuff']:
                                if ingredients['foodstuff'] == '':
                                    ingredients['foodstuff'] = word
                                else:
                                    ingredients['foodstuff'] += ", "+word
                            # now that the foodstuff is identified, all else is state/preparation
                            if word in words:
                                words.remove(word)
                            state = " ".join(words)
                            ingredients["state"] = state
                            break
        # original state of the ingredients field is preserved; two other fields are added, for comparision
        new_ingredients.append(ingredients)
    recipe["ingredients"] = new_ingredients


with open("new_ingredients.json", "w", encoding='UTF-8') as output:
    output.write(json.dumps(recipes_ingredients))
    output.close()
