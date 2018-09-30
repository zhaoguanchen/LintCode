/*

描述控制台
697. Sum of Square Numbers

给一个整数 c, 你需要判断是否存在两个整数 a 和 b 使得 a^2 + b^2 = c.

样例

给出 n = 5
返回 true // 1 * 1 + 2 * 2 = 5
给出 n = -5
返回 false
*/

class CheckSumOfSquareNumbers:
    """
    @param num: the given number
    @return: whether whether there're two integers
    """
    def checkSumOfSquareNumbers(self, num):
        # write your code here
        if num < 0:
            return False
        if num == 0:
            return True
            # 开平方
        root = int(math.sqrt(num))
        for i in range(0,root+1):
            j = math.sqrt(num - i*i)
            # 判断是整数
            if j == int(j):
                return True
        return False
