/**
112. 删除排序链表中的重复元素

给定一个排序链表，删除所有重复的元素每个元素只留下一个。

样例

给出 1->1->2->null，返回 1->2->null

给出 1->1->2->3->3->null，返回 1->2->3->null


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

public class DeleteDuplicates {
    /**
     * @param head: head is the head of the linked list
     * @return: head of linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if (head == null){
            return null;
        }
        
        ListNode res = head;
        ListNode list = head.next;
        while(list != null){
            if (list.val == head.val && list != null){
                list = list.next;
                continue;
            }
            head.next = list;
            head = head.next;
            list = list.next;
            
        }
        head.next = list;
        return res;
        
    }
}