class ListNode {
    int value;
    ListNode next;
    public ListNode(int v) {
        value = v;
    }
}

class Solution {
    /* Return the first node when there is two nodes left */
    public ListNode findMiddleEvenFirst(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (first.next.next != null) {
            slow = slow.next;
            first = first.next.next;
        }
        return slow;
    }

    public ListNode findMiddleEvenSecond(ListNode second) {
        ListNode first = head;
        ListNode slow = head;
        while (first != null) {
            slow = slow.next;
            first = first.next.next;
        }
        return slow;
    }
}