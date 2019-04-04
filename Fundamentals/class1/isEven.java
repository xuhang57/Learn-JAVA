class Solution {
    public static boolean isEven(int x) {
        // boolean b = x % 2 == 0 ? 1: 0;
        boolean b = (x % 2 == 0);
        return b;
    }

    public static void main(String[] args) {
        System.out.println(Solution.isEven(2));
        System.out.println(Solution.isEven(3));
    }
}