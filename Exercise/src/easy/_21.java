package easy;

public class _21 {

    public static void main(String[] args) {
        _21 test = new _21();

        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(3);
        list1.next = list2;
        ListNode list3 = new ListNode(5);
        list2.next = list3;

        ListNode list4 = new ListNode(2);
        ListNode list5 = new ListNode(4);
        list4.next = list5;
        ListNode list6 = new ListNode(6);
        list5.next = list6;

        System.out.println(test.mergeTwoLists(list1, list4).toString());
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {


        ListNode newList = new ListNode(-1);
        ListNode pointer = newList;

        while (list1 != null && list2 != null) {
            // 对比一下两边
            // 哪个更大
            if (list1.val > list2.val) {
                pointer.next = list2;
                list2 = list2.next;
            } else {
                pointer.next = list1;
                list1 = list1.next;
            }
            pointer = pointer.next;
        }

        pointer.next = list1 == null ? list2 : list1;
        return newList.next;
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

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}