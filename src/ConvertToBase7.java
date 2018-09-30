/*
977. Base 7
Given an integer, return its base 7 string representation.

样例
Given num = 100, return "202".

Given num = -7, return "-10".

注意事项
The input will be in range of [-1e7, 1e7].
*/

public class ConvertToBase7 {
    /**
     * @param num: the given number
     * @return: The base 7 string representation
     */
    public String convertToBase7(int num) {
        // Write your code here
      if (num == 0) {
			return "0";
		}
		int number = Math.abs(num);
		String str = "";
		while (number > 0) {
			int n = number % 7;
			str =n + str;
			number /= 7;
		}
		if (num < 0) {
			str = "-" + str;
		}
		return str;
        
    }
}