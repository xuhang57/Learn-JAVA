import java.util.Deque;

class Solution {
    public int sumOfStack(Deque<Integer> stack) {
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}