/*
31. 数组划分

给出一个整数数组 nums 和一个整数 k。划分数组（即移动数组 nums 中的元素），使得：

所有小于k的元素移到左边
所有大于等于k的元素移到右边
返回数组划分的位置，即数组中第一个位置 i，满足 nums[i] 大于等于 k。

样例

给出数组 nums = [3,2,2,1] 和 k = 2，返回 1.

挑战

使用 O(n) 的时间复杂度在数组上进行划分。

注意事项

你应该真正的划分数组 nums，而不仅仅只是计算比 k 小的整数数，如果数组 nums 中的所有元素都比 k 小，则返回 nums.length。
*/



public class PartitionArray {
    /**
     * @param nums: The integer array you should partition
     * @param k: An integer
     * @return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
        // write your code here
        int length = nums.length -1;
        if(length == -1){
            return 0;
        }
        int i = 0, j = length;
        int tmp;
        while(i<=j){
            if(i == length){
                return length +1;
            }
            if(j == -1){
                return 0;
            }
               
            if(nums[i]< k){
                i++;
                continue;
            }
            if(nums[j] >= k){
                j--;
                continue;
            }
            
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            
        }
        return j + 1;
        
    }
}