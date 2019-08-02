class Solution {
    /* returns a random number within the range [a, b] with equal probabilities */
    public int random(int a, int b) {
        Random rand = new Random();
        return a + rand.nextInt(b-a+1);
    }
}