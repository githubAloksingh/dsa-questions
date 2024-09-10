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
    private int gcd(int a, int b){
            if(b==0){
                return a;
            }
           return gcd(b,a%b);
        }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
            if(head==null ||head.next==null){
                return head;
            }
            ListNode currNode=head;
            ListNode nextNode=head.next;
        
        while(currNode!=null && currNode.next!=null){
            int gcdVal=gcd(currNode.val, currNode.next.val);
            ListNode gcdNode = new ListNode(gcdVal);
            currNode.next=gcdNode;
            gcdNode.next=nextNode;
            currNode=nextNode;
            nextNode=nextNode.next;
            
            
        }
        return head;
    }
}







            
