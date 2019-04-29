class ListNode {
    int value;
    ListNode next;
    public ListNode(int v) {
        value = v;
    }
}

class Solution {
    /* insert a value in a sorted LinkedList and maintain sorted order */
    ListNode insertNode(ListNode head, int target) {
        ListNode cur = head;
        while (cur.next != null) {
            if(target >= cur.value && target < cur.next.value) {
                ListNode newNode = new ListNode(target);
                ListNode nextNode = cur.next;
                cur.next = newNode;
                newNode.next = nextNode;
                return head;
            }
            cur = cur.next;
        }
        return head;
    }
}