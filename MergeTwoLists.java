/*
165. 合并两个排序链表

将两个排序链表合并为一个新的排序链表

样例

给出 1->3->8->11->15->null，2->null， 返回 1->2->3->8->11->15->null。
*/

/**
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

public class MergeTwoLists {
    /**
     * @param l1: ListNode l1 is the head of the linked list
     * @param l2: ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        if (l1 == null ){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        
        
       int x =  l1.val>l2.val? l2.val:l1.val;
       if (l1.val>l2.val){
            x = l2.val;
            l2 = l2.next;
       }else{
            x = l1.val;
            l1 = l1.next;
       }
       
        ListNode list = new ListNode (x);
        ListNode res = list;
      
        while(l1 != null || l2 != null){
            if (l2 == null ){
                list.next = l1;
                return res;
            }
             if (l1 == null ){
                list.next = l2;
                return res;
            }
        
           if (l1.val>l2.val){
                x = l2.val;
                l2 = l2.next;
            }else{
                 x = l1.val;
                l1 = l1.next;
            }
       
            list.next = new ListNode (x);
            list = list.next;
        }
        
        return res;
        
    }
}