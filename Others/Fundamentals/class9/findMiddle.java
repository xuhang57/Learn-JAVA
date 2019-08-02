class ListNode {
    int value;
    ListNode next;
    public ListNode(int v) {
        value = v;
    }
}

class Solution {
    /* find the middle node of a linked list with odd number of nodes */
    public ListNode findMiddleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}