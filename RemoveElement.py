# 172. 删除元素
# 给定一个数组和一个值，在原地删除与值相同的数字，返回新数组的长度。

# 元素的顺序可以改变，并且对新的数组不会有影响。

# 样例
# 给出一个数组 [0,4,4,0,0,2,4,4]，和值 4

# 返回 4 并且4个元素的新数组为[0,0,0,2]

class RemoveElement:
    """
    @param: A: A list of integers
    @param: elem: An integer
    @return: The new length after remove
    """
    def removeElement(self, A, elem):
        # write your code here
        while elem in A:
            A.remove(elem)
        return len(A)
