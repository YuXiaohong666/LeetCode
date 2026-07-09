package easy;

public class _203_RemoveLinkedListElements {
    public static void main(String[] args) {
        _203_RemoveLinkedListElements obj = new _203_RemoveLinkedListElements();
        ListNode test1 = new ListNode(1);
        ListNode test2 = new ListNode(2);
        ListNode test3 = new ListNode(6);
        ListNode test4 = new ListNode(3);
        ListNode test5 = new ListNode(4);
        ListNode test6 = new ListNode(5);
        ListNode test7 = new ListNode(6);
        test1.next = test2;
        test2.next = test3;
        test3.next = test4;
        test4.next = test5;
        test5.next = test6;
        test6.next = test7;

        System.out.println(obj.removeElements(test1, 6));
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return dummy.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
