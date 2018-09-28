/*
735. 替换为右侧最大值

给一整数数组, 用当前元素之后数组中的最大元素来替换当前元素(右侧的最大元素). 因为最后一个元素的右边没有元素了, 所以用 -1 来替换这个值. 举个例子, 如果数组为 [16,17,4,3,5,2], 那么它就需要修改为 [17,5,5,5,2,-1].

样例

给出数组 nums = [16,17,4,3,5,2], 改变数组为 [17,5,5,5,2,-1], 你需要在原地实现。
*/
public class ArrayReplaceWithGreatestFromRight {
    /**
     * @param nums: An array of integers.
     * @return: nothing
     */
    public void arrayReplaceWithGreatestFromRight(int[] nums) {
        // Write your code here.
        int len = nums.length;
        
        int tmp = nums[len -1];
        int tmp1;
        for (int i = len - 2; i >= 0;i--){
    
            tmp1 = nums[i]>tmp?nums[i]:tmp;
            nums[i] = tmp;
            tmp = tmp1;
        }
        nums[len-1] = -1;
    }
}