class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        List<Integer> mergeArray = new ArrayList<>();
        
        int index = 0;
        ListNode current1 = list1;
        while (index < a) {
            mergeArray.add(current1.val);
            current1 = current1.next;
            index++;
        }
        ListNode current2 = list2;
        while (current2 != null) {
            mergeArray.add(current2.val);
            current2 = current2.next;
        }
        while (index < b + 1) {
            current1 = current1.next;
            index++;
        }
        while (current1 != null) {
            mergeArray.add(current1.val);
            current1 = current1.next;
        }
        ListNode resultList = null;
        for (int i = mergeArray.size() - 1; i >= 0; i--) {
            ListNode newNode = new ListNode(mergeArray.get(i), resultList);
            resultList = newNode;
        }
        return resultList;
    }
}