package easy;

import java.util.HashSet;
import java.util.Set;

public class _141LinkedListCycle {
    public static void main(String[] args) {
        ListNodeL141 list1 = new ListNodeL141(3);
        ListNodeL141 list2 = new ListNodeL141(3);
        ListNodeL141 list3 = new ListNodeL141(3);
        ListNodeL141 list4 = new ListNodeL141(3);
        list1.next = list2;
//        list2.next = list3;
//        list3.next = list4;
//        list4.next = list2;

        _141LinkedListCycle test = new _141LinkedListCycle();
        System.out.println(test.hasCycle(list1));
    }

    public boolean hasCycle(ListNodeL141 head) {
        if (head == null) return false;
        Set<ListNodeL141> set = new HashSet<>();
        while (head.next != null) {
            boolean flag = set.add(head);
            if (!flag) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public boolean slowFastSolution(ListNodeL141 head) {
        ListNodeL141 fast = head;
        ListNodeL141 slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}

class ListNodeL141 {
    int val;
    ListNodeL141 next;

    ListNodeL141(int x) {
        val = x;
        next = null;
    }
}