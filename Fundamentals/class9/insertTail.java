class ListNode {
    int value;
    ListNode next;
    public ListNode (int v) {
        value = v;
    }
}

class Solution {
    ListNode insertNode(ListNode head, int target) {
        if (head == null) {
            return new ListNode(target);
        }
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new ListNode(target);
        return head;
    }
}