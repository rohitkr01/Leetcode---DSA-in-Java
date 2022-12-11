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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode dummy = head;
        ListNode itr1 = dummy;
        ListNode evenDummy = head.next;
        ListNode itr2 = evenDummy;
        while(itr1 != null && itr1.next != null && itr2 != null && itr2.next != null){
            itr1.next = itr1.next.next;
            itr1 = itr1.next;

            itr2.next = itr2.next.next;
            itr2 = itr2.next;
        }
        itr1.next = evenDummy;

        return dummy;
    }
}