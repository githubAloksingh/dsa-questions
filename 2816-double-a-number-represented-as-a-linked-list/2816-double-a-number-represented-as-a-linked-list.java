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
    
     private ListNode reverse(ListNode head) {
         ListNode prev = null;
         ListNode current=head;
         ListNode nextNode=null;
         while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        
        return prev;
    }
    
    public ListNode doubleIt(ListNode head){
        ListNode reversed= reverse(head);
        ListNode temp=reversed;
        ListNode prev=null;
        int carry=0;
        while(temp!=null){
            int newVal=temp.val*2+carry;
            temp.val=newVal%10;
            carry=newVal/10;
            prev=temp;
            temp=temp.next;
            
        }
        if(carry>0){
            prev.next=new ListNode(carry);
        }
        return reverse(reversed);
    }
}

     