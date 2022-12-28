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
     // Optimized Approach 
    public boolean isPalindrome(ListNode head) {
        //f
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid = reverseList(slow);
        while(mid != null ){
            if(head.val != mid.val){
               return false;
            }
            head = head.next;
            mid = mid.next;
        }
        return true;
    }
    
    public ListNode reverseList(ListNode head){
        if(head==null || head.next == null) return head;
        
        ListNode currNode = head;
        ListNode prevNode = null;
         while(currNode != null){
             ListNode nextNode = currNode.next;
             currNode.next = prevNode;
             prevNode = currNode;
             currNode = nextNode;
         }   
        return prevNode;
    } 
}