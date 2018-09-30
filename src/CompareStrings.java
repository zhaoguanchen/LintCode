/*

55. 比较字符串

比较两个字符串A和B，确定A中是否包含B中所有的字符。字符串A和B中的字符都是 大写字母

样例

给出 A = "ABCD" B = "ACD"，返回 true

给出 A = "ABCD" B = "AABC"， 返回 false

注意事项

在 A 中出现的 B 字符串里的字符不需要连续或者有序。
*/   


public class CompareStrings {
    /**
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        int[] count = new int[26];
        int[] count1 = new int[26];
        int index = 0;
        for (int i = 0; i < A.length(); i++) {
            index = A.charAt(i) - 'A';
            count[index] += 1;
        }
        int index1 = 0;
        for (int i = 0; i < B.length(); i++) {
            index1 = B.charAt(i) - 'A';

            count1[index1] += 1;


        }

        for (int i = 0; i < count1.length; i++) {
            if (count[i] < count1[i]) {
                return false;
            }
        }


        return true;
    }
}
