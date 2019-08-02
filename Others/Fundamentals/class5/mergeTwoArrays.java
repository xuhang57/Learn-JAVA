import java.util.Arrays;

class Solution {
    public static int[] merge(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                result[k] = array1[i++];
            } else {
                result[k] = array2[j++];
            }
            k++;
        }

        while (i < array1.length) {
            result[k++] = array1[i++];
        }

        while (j < array2.length) {
            result[k++] = array2[j++];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] array1 = {3,7};
        int[] array2 = {1,6,8,9};
        System.out.println(Arrays.toString(Solution.merge(array1, array2)));
    }

}