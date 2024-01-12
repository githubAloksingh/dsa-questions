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
        ArrayList<Integer> ts=new ArrayList<Integer>();
        ListNode dummy=new ListNode(0);
        ListNode curr=list1;
        while(curr!=null){
            ts.add(curr.val);
            curr=curr.next;
            
        }
        curr=list2;
         while(curr!=null){
            ts.add(curr.val);
            curr=curr.next;
            
        }
        Collections.sort(ts);
        ListNode ans=dummy;
        for(int i=0;i<ts.size();i++){
            ans.next=new ListNode(ts.get(i));
            ans=ans.next;
            
        }
        return dummy.next;
        
    }
}