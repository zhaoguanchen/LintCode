/**
96. 链表划分

给定一个单链表和数值x，划分链表使得所有小于x的节点排在大于等于x的节点之前。

你应该保留两部分内链表节点原有的相对顺序。

样例

给定链表 1->4->3->2->5->2->null，并且 x=3

返回 1->2->2->4->3->5->null


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

public class Partition {
    /**
     * @param head: The first node of linked list
     * @param x: An integer
     * @return: A ListNode
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        ListNode before = new ListNode(0);
        ListNode res = before;
        ListNode after = new ListNode(0);
        ListNode bond = after;
        
        while(head != null){
            if(head.val < x){
                before.next = head;
                before = before.next;
            }else{
                after.next = head;
                after = after.next;
            }
            head = head.next;
            
        }
        after.next = null;
    before.next = bond.next;
        
    return res.next;  
    }
}