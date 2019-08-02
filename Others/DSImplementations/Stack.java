/* Implement a Stack with using a LinkedList (singly) */
public class ListNode {
    int value;
    ListNode next;
    public ListNode(int val) {
        value = val;
    }
}

//   1 -> 2 -> 3 -> 4
//   H
class MyStack {
    private ListNode head;

    public myStack() {
        head = null;
    }

    public void push(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public Integer pop() {
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        head = head.next;
        // Best Practice: clean up the next pointer for returning
        prev.next = null;
        return prev.val;
    }

    public Integer peek() {
        if (head == null) {
            return null;
        }
        return head.value;
    }
}

