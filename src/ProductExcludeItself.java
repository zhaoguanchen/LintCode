/*
50. 数组剔除元素后的乘积

给定一个整数数组A。

定义B[i] = A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]， 计算B的时候请不要使用除法。

样例

给出A=[1, 2, 3]，返回 B为[6, 3, 2]
*/

public class ProductExcludeItself {
    /*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        ArrayList<Long> tmp = new ArrayList<Long>();
        Long a =1L;
        Long b =1L;
        
        for (int i = 0;i<nums.size() ;i++ ) {
            if(i == 0){
              tmp.add(a) ;
                continue;
            }
         
            a = nums.get(i-1)*a;
            tmp.add(a);
            
            
        }
        for (int i = nums.size() -1;i>=0 ;i-- ) {
            if(i == nums.size() -1){
                continue;
            }
            b = nums.get(i+1)*b;
            tmp.set(i,tmp.get(i)*b);
        }
        return tmp;
    

    }
}