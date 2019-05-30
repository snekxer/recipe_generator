# recipe_generator
(ONGOING) A repository for all my recipe generator stuff


-- COMMENTS FOR JUSTIN: ingredient_parser.py --

While it works acceptably well in terms of identifying food, it still has much room for improvement, as it only compares/searches for individual words instead of the whole possible ingredient. For the sentence:

      white vinegar

the script searches 'white', and then 'vinegar', when the whole ingredient is actually 'white vinegar'. This could be potentially fixed with the use of n-grams, although that could also generate false positives by including foodstuff words along words that are not food: 'white vinegar, cold' would generate the bigrams:

      white, vinegar
      vinegar, cold --> commas are stripped in parsing
     
'vinegar cold' would result in a foodstuff match, even if it's not really one, because it has 'vinegar' in it. Expanding on this idea, there are cases in which neither of the individual words are a foodstuff, but together they are (such as 'bay leaves'), or cases where one is registered as a foodstuff and the other one isn't, but both of them are an ingredient that is different from the individual one ('Parsley' vs 'Italian Parsley'; 'Onion' vs 'Pearl Onion', 'Onion vs 'Green Onion'). I need to think more on this to see how could I solve it.
      
Another aspect for improvement is false positives in terms of what is the actual ingredient and what's just extra information: 'canned tomatoes with juice' gets both tomatoes and juice as the foodstuff, when technically only the tomatoes should be, as the juise is dependent on the tomatoes. This is up for debate, I guess, as technically the juice IS an ingredient.... In the same vein as above, 'tomatoes' is not the same ingredient as 'canned tomatoes', a significant difference in the moment of cooking.

Code-wise, it hurts my eyes to have such a huge nest of 'for' loops, but it's far simpler AND efficient to do it like this, as it's *somewhat* clear which loop goes into which level and why. For some reason, enconding tends to fail me in python, this project being no exeption: the fraction characters get weird when I see them in a file, but not in my IDE or terminal, despite all of them having UTF-8 support and the file being read/written with UTF-8.




