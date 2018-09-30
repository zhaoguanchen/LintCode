# 22. 平面列表

# 给定一个列表，该列表中的每个要素要么是个列表，要么是整数。将其变成一个只包含整数的简单列表。

# 样例

# 给定 [1,2,[1,2]]，返回 [1,2,1,2]。

# 给定 [4,[3,[2,[1]]]]，返回 [4,3,2,1]。

# 挑战

# 请用非递归方法尝试解答这道题。

# 注意事项

# 如果给定的列表中的要素本身也是一个列表，那么它也可以包含列表。

class Flatten(object):

    # @param nestedList a list, each element in the list 
    # can be a list or integer, for example [1,2,[1,2]]
    # @return {int[]} a list of integer
    def flatten(self, nestedList):
        # Write your code here
        # 判断是否是已知类型  int
        if isinstance(nestedList, int):
            return [nestedList]
        
        ret = []
        while len(nestedList) > 0:
            # 列表弹出第一个元素 
            # 是int则弹出，添加至新list
            # 否则合并至大列表
            current = nestedList.pop(0)
            if isinstance(current, int):
                ret.append(current)
            else:
                nestedList = current + nestedList
        return ret