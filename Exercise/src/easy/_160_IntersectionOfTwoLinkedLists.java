package easy;

import java.util.HashSet;
import java.util.Set;

public class _160_IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode flagNode = null;
        while (true) {
            if (headA == null && headB == null) break;
            if (headA != null) {
                if (!set.add(headA)) {
                    flagNode = headA;
                    break;
                }
                headA = headA.next;
            }
            if (headB != null) {
                if (!set.add(headB)) {
                    flagNode = headB;
                    break;
                }
                headB = headB.next;
            }
        }
        return flagNode;
    }

    //    优化解法：双指针换头法
    public ListNode instantFunc(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }

        return pA;
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
