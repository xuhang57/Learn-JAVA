class Solution {
    public static boolean isPrime(int x) {
        for (int i = 2; i*i <= x; i++) {
            if (x%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Solution.isPrime(3));
        System.out.println(Solution.isPrime(5));
        System.out.println(Solution.isPrime(8));
        
    }
}