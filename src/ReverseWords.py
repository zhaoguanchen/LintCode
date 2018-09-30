/*

描述控制台
53. 翻转字符串

给定一个字符串，逐个翻转字符串中的每个单词。

说明

单词的构成：无空格字母构成一个单词
输入字符串是否包括前导或者尾随空格？可以包括，但是反转后的字符不能包括
如何处理两个单词间的多个空格？在反转字符串中间空格减少到只含一个

样例
给出s = "the sky is blue"，返回"blue is sky the"
*/

class ReverseWords:
    """
    @param: s: A string
    @return: A string
    """
    def reverseWords(self, s):
        # write your code here
        
        # reversed()
        # 内置函数，反向迭代子
        # string.join(seq)   
        # 以 string 作为分隔符，将 seq 中所有的元素(的字符串表示)合并为一个新的字符串
            
        return ' '.join(reversed(s.strip().split()))