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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> al = new ArrayList<>();
        for (ListNode list : lists) {
            while (list != null) {
                al.add(list.val);
                list = list.next;
            }
        }
        Collections.sort(al);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : al) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }
}
