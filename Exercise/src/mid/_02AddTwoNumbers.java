package mid;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class _02AddTwoNumbers {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newListNode = new ListNode(0, null);
        ListNode pointer = newListNode;
        while (true) {
            pointer.val += (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            if (pointer.val > 9) {
                pointer.next = new ListNode(1, null);
                pointer.val -= 10;
                pointer = pointer.next;
            } else {
                if (l1 == null && l2 == null) {
                    return newListNode;
                } else {
                    if (pointer.next == null) {
                        pointer.next = new ListNode(0, null);
                        pointer = pointer.next;
                    }
                }
            }
        }
    }
}


class ListNode {
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
