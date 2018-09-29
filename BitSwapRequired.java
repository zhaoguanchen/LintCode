/*
181. 将整数A转换为B

如果要将整数A转换为B，需要改变多少个bit位？

样例

如把31转换为14，需要改变2个bit位。

(31)10=(11111)2

(14)10=(01110)2

注意事项

Both n and m are 32-bit integers.
*/


public class BitSwapRequired {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: An integer
     */
    public int bitSwapRequired(int a, int b) {
        // write your code here
        
        int c = a ^ b;
        // java 自带二进制计数方法
        return Integer.bitCount(c);
        
       
    }
}