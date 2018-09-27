/*
1348. Excel Sheet Column Number

Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

样例

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
*/

public class TitleToNumber {
    /**
     * @param s: a string
     * @return: return a integer
     */
    public int titleToNumber(String s) {
        // write your code here
        int len = s.length();
        int res = 0;
        for (int i = len -1; i>=0 ; i--){
             res =res +  (s.charAt(i)-64)*(int)Math.pow(26,len - 1 -i);
        }
        return res;
    }
}