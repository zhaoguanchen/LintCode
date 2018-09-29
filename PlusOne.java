/*
407. 加一

给定一个非负数，表示一个数字数组，在该数的基础上+1，返回一个新的数组。

该数字按照数位高低进行排列，最高位的数在列表的最前面。

样例

给定 [1,2,3] 表示 123, 返回 [1,2,4].

给定 [9,9,9] 表示 999, 返回 [1,0,0,0].
*/

public class PlusOne {
    /**
     * @param digits: a number represented as an array of digits
     * @return: the result
     */
    public int[] plusOne(int[] digits) {
        // write your code here
        int length = digits.length;
        int [] res = new int [length + 1];
        
        int carry = 1;
        int sum = 0;
        for(int i = length - 1; i >= 0; i--){
            
            sum = (digits[i] + carry) == 10 ? 0 : (digits[i] + carry) ;
            carry = (digits[i] + carry) == 10 ? 1 : 0;
            digits[i] = sum;
            
        }
        
        if(carry > 0){
            res[0] = carry;
            for(int i = 0; i<length;i++){
                res[i+1] = digits[i];
            }
            return res;
        }
        else{
            return digits;
        }
        
    }
}