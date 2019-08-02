/* Implement a Queue with using LinkedList (singly) */
public class ListNode {
    int value;
    ListNode next;
    public ListNode(int v) {
        value = v;
    }
}

class MyQueue {
    private ListNode head;
    private ListNode tail;
    
    public myQueue() {
        head = null;
        tail = null;
    }

    //   1 -> 2 -> 3 -> 4
    //   H              T
    public void offer(int val) {
        if (head == null) {
            head = new ListNode(val);
            tail = head;
        } else {
            tail.next = new ListNode(val);
            tail = tail.next;
        }
    }

    public Integer poll() {
        if (head == null) {
            return null;
        }
        ListNode firstNode = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        // Best Practice: clean up the node next pointer
        firstNode.next = null;
        return firstNode.val;
    }

    public Integer peek() {
        if (head == null) {
            return null;
        }
        
        return head.val;
    }
}