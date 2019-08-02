class Solution {
    public static boolean areRoughlyEqual(double x, double y) {
        boolean b = (x-y < 0.0001) && (y-x<0.0001);
        return b;
    }
}