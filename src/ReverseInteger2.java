/*
413. 反转整数(溢出)

将一个整数中的数字进行颠倒，当颠倒后的整数溢出时，返回 0 (标记为 32 位整数)。

样例

给定 x = 123，返回 321

给定 x = -123，返回 -321
*/

public class ReverseInteger {
    /**
     * @param n: the integer to be reversed
     * @return: the reversed integer
     */
    public int reverseInteger(int n) {
        // write your code here
        int result = 0;
        while (n != 0) {
            int prev = result;
            result *= 10;
            result += n % 10;
            // 判断溢出
            if (result / 10 != prev) {
                result = 0;
                break;
            }
            n /= 10;
        }
        return result;

}
}