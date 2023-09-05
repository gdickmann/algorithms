public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list4 = new ListNode(8, null);
        ListNode list3 = new ListNode(6, list4);
        ListNode list2 = new ListNode(4, list3);
        ListNode list1 = new ListNode(2, list2);

        doubleEachNodeValueWithDummyNode(list1);
    }

    private static ListNode doubleEachNodeValueWithDummyNode(ListNode l1) {
        ListNode dummy = new ListNode();
        ListNode current = new ListNode();

        while (l1.next != null) {
            current.next = new ListNode(l1.val * 2);
            l1 = l1.next;
            current = current.next;
        }

        return dummy.next;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
