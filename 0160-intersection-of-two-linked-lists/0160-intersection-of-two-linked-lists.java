/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode list1 = headA , list2 = headB;
        while(list1 != list2){
            if(list1== null){
                list1 = headA;
            }
            else{
                list1 = list1.next;
            }
            
            if(list2 == null){
                list2 = headB;
            }
            else{
                list2 = list2.next;
            }
            
        }
        
        return list1;
    }
}