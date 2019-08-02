class Solution {
    public static int min(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            // min = arr[i] < m ? arr[i] : m;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a = {3,4,5,2,1};
        System.out.println(Solution.min(a));
    }
}