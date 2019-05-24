

class Solution {
    public int[] kSmallest(int[] array, int k) {
        if(array.length == 0 || k == 0) {
            return new int[0];
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                if(n1.equals(n2)) {
                    return 0;
                }
                return n1 > n2 ? -1 : 1;
            }
        });

        for(int i = 0; i < array.length; i++) {
            if(i < k) {
                maxHeap.offer(array[i]);
            } else if(array[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(array[i]);
            }
        }
        int[] result = new int[k];
        for(int i = k-1; i >= 0; i--) {
            result[i] = maxHeap.poll();
        }

        return result;
    }

    public int[] kSmallestII(int[] array, int k) {
        if(array.length == 0 || k == 0) {
            return new int[0];
        }
        quickSelect(array, 0, array.length-1, k-1);
        int[] result = Arrays.copyOf(array, k);
        Arrays.sort(result);
        return result;
    }

    private void quickSelect(int[] array, int left, int right, int target) {
        int mid = partition(array, left, right);
        if(mid == target) {
            return;
        } else if(target < mid) {
            quickSelect(array, left, mid-1, target);
        } else {
            quickSelect(array, mid+1, right, target);
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int start = left;
        int end = right - 1;
        while(start <= end) {
            if(array[start] < pivot) {
                start++;
            } else if(array[end] >= pivot) {
                end--;
            } else {
                swap(array, start++, end--);
            }
        }
        swap(array, start, right);
        return start;
    }

    private void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}