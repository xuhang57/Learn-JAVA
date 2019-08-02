public class SelectionSort {
    public int[] SelectionSort(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }

        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
        return array;
    }

    public void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
        int[] a = new int[] {4,3,2,1};
        int[] b = new int[] {5,6,5,3,2,6,4,7,8};
        int[] c = null;
        SelectionSort ss = new SelectionSort();

        // Arrays.toString(a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }

}