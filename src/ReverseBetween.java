/**
36. 翻转链表 II

翻转链表中第m个节点到第n个节点的部分

样例

给出链表1->2->3->4->5->null， m = 2 和n = 4，返回1->4->3->2->5->null

挑战

在原地一次翻转完成

注意事项

m，n满足1 ≤ m ≤ n ≤ 链表长度
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class ReverseBetween {
    /**
     * @param head: ListNode head is the head of the linked list 
     * @param m: An integer
     * @param n: An integer
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write your code here
        ListNode replace = new ListNode(0);
       
        int [] array =  new int [n - m +1];
        ListNode sourse = replace;
        ListNode destinct = head;
        replace.next = destinct;
        int i = 1;
        if(n == m){
            return replace.next;
        }
        while(i < m){
            sourse = sourse.next;
            head = sourse;
            i++;
            head = head.next;
        }
        
        for(int k = m;k<=n;k++){
            array[k - m] = head.val;
            head = head.next;
        }
        for(int j = n-m;j>=0;j--){
            sourse.next = new ListNode(array[j]);
            sourse = sourse.next;
        }
        sourse.next = head;
        
    return replace.next;
    
    
    }
}