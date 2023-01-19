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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null & list2 == null)  return null;
        if(list1 == null)  return list2;
        if(list2 == null)  return list1;
        
        ListNode temp = new ListNode(-1);
        ListNode itr = temp;
        
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val) {
                itr.next = list1;
                list1 = list1.next;
                itr = itr.next;
            }else{
                itr.next = list2;
                list2 = list2.next;
                itr = itr.next;
            }
        }
        if(list1 != null) itr.next = list1;
        if(list2 != null) itr.next = list2;
        
        return temp.next;
    }
}