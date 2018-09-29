/*
157. 判断字符串是否没有重复字符
实现一个算法确定字符串中的字符是否均唯一出现

样例
给出"abc"，返回 true

给出"aab"，返回 false

挑战
如果不使用额外的存储空间，你的算法该如何改变？
*/

public class IsUnique {
    /*
     * @param str: A string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        for (int i=0;i<str.length()-1;i++){           
            for (int j=i+1;j<str.length();j++){           
                if (str.charAt(i)==str.charAt(j)){   
                    return false;            
                }        
            }      
        }     
        return true;
    }
}