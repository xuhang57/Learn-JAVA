import java.util.Deque;

public class StackWithMin {
    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public StackWithMin() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public Integer min() {
        if (minStack.isEmpty()) {
            return null;
        }
        return minStack.peekFirst();
    }

    public void push(int value) {
        stack.offerFirst(value);

        // when value <= current min value in stack, need to push the value to minStack
        if (minStack.isEmpty() || value < minStack.peekFirst()) {
            minStack.offerFirst(value);
        }
    }

    public Integer pop() {
        if (stack.isEmpty()) {
            return null;
        }
        Integer result = stack.pollFirst();

        if (minStack.peekFirst().equals(result)) {
            minStack.pollFirst();
        }
        return result;
    }

    public Integer top() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.peekFirst();
    }
}