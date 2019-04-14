import java.util.Arrays;

public class QuickSort {
    public int[] quickSort(int[] array) {
        if (array == null) {
            return array;
        }
        quickSort(array, 0, array.length-1);
        return array;
    }

    public void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        // define a pivot and use the pivot to partition the array
        int pivotIndex = partition(array, left, right);
        // pivot has already at its position, when we do the recursive call on the two partitions,
        // pivot should not be included in any of them
        quickSort(array, left, pivotIndex-1);
        quickSort(array, pivotIndex+1, right);
    }

    public int partition(int[] array, int left, int right) {
        int pivotIdx = pivotIndex(left, right);
        int pivot = array[pivotIdx];
        swap(array, pivotIdx, right);
        int leftBound = left;
        int rightBound = right - 1;
        while (leftBound <= rightBound) {
            if (array[leftBound] < pivot) {
                leftBound++;
            } else if (array[rightBound] >= pivot) {
                rightBound--;
            } else {
                swap(array, leftBound++, rightBound--);
            }
        }
        // swap back the pivot
        swap(array, leftBound, right);
        return leftBound;
    }

    private int pivotIndex(int left, int right) {
        return left + (int) (Math.random() * (right - left + 1));
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args) {
        QuickSort qc = new QuickSort();

        int[] array = null;
        array = qc.quickSort(array);
        System.out.println(Arrays.toString(array));

        array = new int[] {5,2,6,8,4,2,5,7};
        array = qc.quickSort(array);
        System.out.println(Arrays.toString(array));

    }
}
