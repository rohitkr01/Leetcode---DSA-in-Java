/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    //Space complexity : O(n)
//     public boolean hasCycle(ListNode head) {
//         if(head == null || head.next == null) 
//             return false;
        
//         ArrayList<ListNode> list = new ArrayList<>();
//         ListNode curr = head;
//         while(curr != null){
//             if(list.contains(curr)){
//                 return true;
//             }
//             list.add(curr);
//         }
//         return false;
//     }
    
    // Space : O(1)
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)  return false;
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)   
                return true;
        }
        
        return false;
    }
}