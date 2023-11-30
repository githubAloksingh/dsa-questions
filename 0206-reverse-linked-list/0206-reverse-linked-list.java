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
    public ListNode reverseList(ListNode head) {
        
        
//         (Iterative)
//         ListNode prev=null;
//         ListNode curr=head;
//         ListNode next;
//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
            
//             prev=curr;
//             curr=next;
//         }
//         return prev;
        
        
        //(Recursive)
        if(head==null ||head.next==null){
            return head;
        }
        ListNode newHead=reverseList(head.next);
            head.next.next=head;
            head.next=null;
        return newHead;
    }
}