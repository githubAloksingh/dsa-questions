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
    public ListNode detectCycle(ListNode head) {
       
         if(head==null || head.next==null)
        return null;
        ListNode curr=head;
        HashMap<ListNode,Integer> map=new HashMap<>();
        while(curr!=null){
            if(map.containsKey(curr)){
                return curr;
            }
            map.put(curr,1);
            curr=curr.next;
            }
            return null;
        }
        
    }
