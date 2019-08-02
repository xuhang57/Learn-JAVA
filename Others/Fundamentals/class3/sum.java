class Solution {
    public int sum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int s = 0;
        for (int x: arr) {
            s += x;
        }
        return s;
    }
}