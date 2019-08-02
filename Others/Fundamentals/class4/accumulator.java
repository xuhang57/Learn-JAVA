class Accumulator {
    int s = 0;
    public void add(int x) {
        s += x;
    }

    public int sum() {
        return s;
    }
}