/*

描述控制台
64. 合并排序数组

合并两个排序的整数数组A和B变成一个新的数组。

样例

给出 A = [1, 2, 3, empty, empty], B = [4, 5]

合并之后 A 将变成 [1,2,3,4,5]

注意事项

你可以假设A具有足够的空间（A数组的大小大于或等于m+n）去添加B中的元素。

*/


public class MergeSortedArray {
    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int i =0,j=0,k = 0;
        int tmp= 0;
        int[] C = new int [m+n];
        
        while(i<m ||j<n){
            if (j >=n ){
                C[k++]= A[i];
                i++;
                continue;
            }
            if (i >=m ){
                C[k++]= B[j];
                j++;
                continue;
            }
            
            if( A[i]<B[j]){
                C[k++] = A[i];
                i++;
            }else{
                C[k++] = B[j];
                j++;
            }
            
        }
        
        
        for (int s = 0;s<m+n ;s++ ) {
            A[s] = C[s];
        }
    }
}