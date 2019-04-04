class Solution {
    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i*i < n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Solution.sumOfSquares(3));
        System.out.println(Solution.sumOfSquares(10));
    }
}