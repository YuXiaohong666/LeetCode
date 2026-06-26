package easy;

public class _83RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode pointer = head;
        while (pointer.next != null) {
            if (pointer.val == pointer.next.val) {
//            链接下一个节点
                pointer.next = pointer.next.next;
            } else {
                pointer = pointer.next;
            }
        }
        return head;
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


