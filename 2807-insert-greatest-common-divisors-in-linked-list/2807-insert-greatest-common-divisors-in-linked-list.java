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
    private int gcd(int a , int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    private void insertGcd(ListNode curr){
        if(curr== null ||curr.next==null){
            return ;
        }
        int gcdVal=gcd(curr.val, curr.next.val);
        ListNode gcdNode = new ListNode(gcdVal);
        gcdNode.next=curr.next;
        curr.next=gcdNode;
        insertGcd(curr.next.next);
        
    }
    
   
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        insertGcd(head);
        return head;
        
    
    }
}








