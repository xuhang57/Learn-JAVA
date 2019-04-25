
class ListNode {
    int value;
    ListNode next;
    public ListNode(int v) {
        value = v;
    }
}

class Solution {
    /**
     * Assume n > 0
     * @param n number of nodes in the LinkedList
     * @return head of the LinkedList
     */
    public ListNode generate(int n) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 1; i < n; i++) {
            cur.next = new ListNode(0);
            cur = cur.next;
        }
        return head;
    }
}