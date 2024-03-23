import java.util.ArrayList;
import java.util.List;

class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode curr = head;
        int list_size = 0;
        List<Integer> al = new ArrayList<>();
        while (curr != null) {
            al.add(curr.val);
            curr = curr.next;
            list_size++;
        }

        curr = head;
        int counter = 0;
        int j = 0;
        while (counter < list_size) {
            if (counter % 2 == 0) {
                curr.val = al.get(j++);
            } else {
                curr.val = al.get(list_size - j);
            }
            curr = curr.next;
            counter++;
        }
    }
}
