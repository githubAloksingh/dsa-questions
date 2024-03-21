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
        if(head== null || head.next==null){
            return head;
        }
        ListNode curr=head;
        Stack<Integer> st = new Stack<>();
        while(curr!=null){
            st.push(curr.val);
            curr=curr.next;
            
        }
        ListNode newHead = new ListNode(st.pop());
         ListNode temp=newHead;
        while(!st.isEmpty()){
             temp.next = new ListNode(st.pop());
            temp=temp.next;
        }
        return newHead;
    }
}