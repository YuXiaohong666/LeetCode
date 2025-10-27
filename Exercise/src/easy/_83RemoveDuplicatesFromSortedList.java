package easy;

public class _83RemoveDuplicatesFromSortedList {
    public ListNode83 deleteDuplicates(ListNode83 head) {
        if (head == null) return null;
        ListNode83 pointer = head;
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
}

class ListNode83 {
    int val;
    ListNode83 next;

    ListNode83() {
    }

    ListNode83(int val) {
        this.val = val;
    }

    ListNode83(int val, ListNode83 next) {
        this.val = val;
        this.next = next;
    }
}
