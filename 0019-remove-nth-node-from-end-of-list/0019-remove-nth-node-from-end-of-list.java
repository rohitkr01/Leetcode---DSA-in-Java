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
    public int size(ListNode head){
        int len = 0;
        if(head==null)  return len;
        while(head != null){
            len++;
            head=head.next;
        }
        return len;
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tempNode = head;
        if(size(head)==n)  
            return head.next;
        
        int len = size(head) - n -1;
        for(int i =0 ;i<len ; i++){
            tempNode = tempNode.next;
        }
        tempNode.next = tempNode.next.next;
        return head;
    }
    
}