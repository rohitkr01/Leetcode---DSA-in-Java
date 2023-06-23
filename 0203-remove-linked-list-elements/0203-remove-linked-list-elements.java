/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        
        ListNode ans = new ListNode(-1);
        ListNode itr = ans;
        
        while(head != null){
            if(head.val != val){
                itr.next = head;
                itr = itr.next;
            }
            head = head.next;
        }
        itr.next = null;
        
        return ans.next;
    }
}