class ListNode {
    int value;
    ListNode next;
    public ListNode (int v) {
        value = v;
    }
}

class Solution {
    /* less than or equal to the target */
    public ListNode partition(ListNode head, int target) {
        if (head == null) {
            return head;
        }

        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode cur1 = dummy1;
        ListNode cur2 = dummy2;
        ListNode cur = head;
        while (cur != null) {
            if (cur.value < target) {
                cur1.next = cur;
                cur = cur.next;
                cur1 = cur1.next;
            } else {
                cur2.next = cur2;
                cur = cur.next;
                cur2 = cur2.next;
            }
        }
        cur1.next = dummy2.next;
        cur2.next = null;
        return dummy1.next;
    }
}