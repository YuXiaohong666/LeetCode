package mid;

import java.util.HashSet;
import java.util.Set;

public class LCR022_c32eOV {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(3);
        ListNode list2 = new ListNode(3);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(3);
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
//        list4.next = list2;

        LCR022_c32eOV test = new LCR022_c32eOV();
        System.out.println(test.detectCycle(list1));
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null) return head;
        Set<ListNode> set = new HashSet<>();
        while (head.next != null) {
            boolean flag = set.add(head);
            if (!flag) {
                return head;
            }
            head = head.next;
        }
        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

