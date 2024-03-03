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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        
        int res=cnt-n;
        temp=head;
        if(cnt==n){
            head=head.next;
        
        return head;
        }
        while(temp!=null){
            res--;
            
            if(res==0)
                break;
            temp=temp.next;
            
        }
        temp.next=temp.next.next;
        return head;
        
    }
}