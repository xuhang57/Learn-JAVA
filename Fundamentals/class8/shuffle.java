import java.util.Deque;

class Solution {
    /** Assume the stack is not null or empty */
    public void shuffle(Deque<Integer> stack1, Deque<Integer> stack2) {
        while (!stack1.isEmpty()) {
            stack2.append(stack1.pop());
        }
    }
}