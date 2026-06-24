package mid;

import java.util.HashSet;
import java.util.Set;

public class LCR022_c32eOV {
    public static void main(String[] args) {
        ListNodeL022 list1 = new ListNodeL022(3);
        ListNodeL022 list2 = new ListNodeL022(3);
        ListNodeL022 list3 = new ListNodeL022(3);
        ListNodeL022 list4 = new ListNodeL022(3);
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
//        list4.next = list2;

        LCR022_c32eOV test = new LCR022_c32eOV();
        System.out.println(test.detectCycle(list1));
    }

    public ListNodeL022 detectCycle(ListNodeL022 head) {
        if (head == null) return head;
        Set<ListNodeL022> set = new HashSet<>();
        while (head.next != null) {
            boolean flag = set.add(head);
            if (!flag) {
                return head;
            }
            head = head.next;
        }
        return null;
    }
}

class ListNodeL022 {
    int val;
    ListNodeL022 next;

    ListNodeL022(int x) {
        val = x;
        next = null;
    }
}