class Solution {
    public static int minIndex(int[] array, int i) {
        int minIndex = i;
        for (int j = i; j < array.length; j++) {
            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr = {0,3,9,8,5,4};
        System.out.println(Solution.minIndex(arr, 2));
    }
}