class ListNode {
    int value;
    ListNode next;
    public ListNode(int v) {
        value = v;
    }
}

class Solution {
    /* recursive version of LinkedList */
    public ListNode reverse(ListNode head) {
        if (head == null && head.next == null) {
            return head;
        }

        ListNode newHead = reverse(head.next);

        ListNode n2 = head.next;
        n2.next = head;
        head.next = null;
        return newHead;
    }
}