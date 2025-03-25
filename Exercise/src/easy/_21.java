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
        ListNode head1 = list1;
        ListNode head2 = list2;

        ListNode newList = new ListNode();
        ListNode pointer;

        if (list1.val < list2.val) {
            newList.val = list1.val;
            list1 = list1.next;
            pointer = list1;
        } else {
            newList.val = list2.val;
            list2 = list2.next;
            pointer = list2;
        }

        while (true) {
            if (head1 == null) {
                pointer.val = head2.val;
                pointer.next = new ListNode();
                pointer = pointer.next;
            } else if (head2 == null) {
                pointer.val = head1.val;
                pointer.next = new ListNode();
                pointer = pointer.next;
            }
            // 对比一下两边
            // 哪个更大
            if (head1.val > head2.val) {
                pointer.val = head2.val;
                pointer.next = new ListNode();
                pointer = pointer.next;
                head2 = head2.next;
            } else {
                pointer.val = head1.val;
                pointer.next = new ListNode();
                pointer = pointer.next;
                head1 = head1.next;
            }


            if ((head1 == null) && (head2 == null)) {
                break;
            }
        }
        return newList;
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