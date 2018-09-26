public class ReverseInteger {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        int a = number/100,aa = number%100;
        int b = aa/10,c = aa%10;
        int result = c*100+b*10+a;
        return result;
    }
}