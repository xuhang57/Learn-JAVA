class ListNode {
    int value;
    ListNode next;
    public ListNode(int v) {
        value = v;
    }
}

class Solution {
    /* if cycle, slow and fast will eventually meet with each other */
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}