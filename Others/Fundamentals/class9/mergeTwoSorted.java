class ListNode {
    int value;
    ListNode next;
    public ListNode (int v) {
        value = v;
    }
}

class Solution {
    public ListNode mergeLL(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        ListNode cur1 = head1;
        ListNode cur2 = head2;

        while (cur1 != null && cur2 != null) {
            if (cur1.value <= cur2.value) {
                cur.next = cur1;
                cur = cur.next;
                cur1 = cur1.next;
            } else {
                cur.next = cur2;
                cur = cur.next;
                cur2 = cur2.next;
            }
        }
        if (cur1 == null) {
            cur.next = cur2;
        }

        if (cur2 == null) {
            cur.next = cur2;
        }
        return dummy.next;
    }
}