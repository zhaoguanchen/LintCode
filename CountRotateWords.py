/*
671. 循环单词

The words are same rotate words if rotate the word to the right by loop, and get another. Count how many different rotate word sets in dictionary.

E.g. picture and turepic are same rotate words.

样例

Given dict = ["picture", "turepic", "icturep", "word", "ordw", "lint"]
return 3.

"picture", "turepic", "icturep" are same ratote words.
"word", "ordw" are same too.
"lint" is the third word that different from the previous two words.

注意事项

所有单词均为小写。
*/



class CountRotateWords:
    """
    @param: words: A list of words
    @return: Return how many different rotate words
    """
            
    def countRotateWords(self, words):
        # Write your code here
        count = 0
        dict = set()
        exist = False
        
        if not words:
            return 0

        for word in words:
            for i in range(len(word)):
                new_word = word[i:] + word[0:i]
                if new_word in dict:
                    exist = True
                    break
            
            if False == exist:
                dict.add(word)
                count += 1
            exist = False

        return count
        

        