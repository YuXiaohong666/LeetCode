package easy;

import java.util.HashSet;
import java.util.Set;

public class _141LinkedListCycle {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(3);
        ListNode list2 = new ListNode(3);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(3);
        list1.next = list2;
//        list2.next = list3;
//        list3.next = list4;
//        list4.next = list2;

        _141LinkedListCycle test = new _141LinkedListCycle();
        System.out.println(test.hasCycle(list1));
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        Set<ListNode> set = new HashSet<>();
        while (head.next != null) {
            boolean flag = set.add(head);
            if (!flag) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public boolean slowFastSolution(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

