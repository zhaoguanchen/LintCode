/*
845. Greatest Common Divisor
Given two numbers, number a and number b. Find the greatest common divisor of the given two numbers.

样例
Given a = 10, b = 15, return 5.
Given a = 15, b = 30, return 15.

注意事项
In mathematics, the greatest common divisor (gcd) of two or more integers, which are not all zero, is the largest positive integer that divides each of the integers.

*/

public class Gcd {
    /**
     * @param a: the given number
     * @param b: another number
     * @return: the greatest common divisor of two numbers
     */
    public int gcd(int a, int b) {
        // write your code here
        if (b == 0) return a;
		int r = a % b;
		return gcd(b, r);

    }
}