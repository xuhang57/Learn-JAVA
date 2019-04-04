class Tesla {
    int numOfWheels;
    int vin;
    public Tesla(int n, int v) {
        numOfWheels = 4;
        vin = v;
    }
}

class Accumulator {
    public Tesla[] make(int n) {
        Tesla[] teslas = new Tesla[n];
        for (int i = 0; i<n; i++) {
            Tesla tesla = new Tesla(4, i);
            teslas[i] = tesla;
        }
        return teslas;
    }
}