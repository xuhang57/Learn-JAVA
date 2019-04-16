import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Mul;

public class fib {
    // Recursive Method
    public long fibonacci(int k) {
        if (k <= 0) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return fibonacci(k-1) + fibonacci(k-2);
    }

    // DP with O(n) space
    public long fibonacciDP(int k) {
        if (k <= 0) {
            return 0;
        }
        long[] array = new long[k+1];
        array[1] = 1;
        for (int i = 2; i <= k; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array[k];
    }

    // DP with O(1) space
    public long fibonacciDP2(int k) {
        long a = 0;
        long b = 1;
        if (k <= 0) {
            return a;
        }
        while (k > 1) {
            long temp = a + b;
            a = b;
            b = temp;
            k--;
        }
        return b;
    }

    // O(logn) soluton using matrix multiplication
    public static final long[][] SEED = { {1L, 1L}, {1L, 0L}};

    public long fibonacciMM(int k) {
        if (k <= 0) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }

        long[][] matrix = { {1L, 1L}, {1L, 0L}};
        pow(matrix, k-1);
        return matrix[0][0];
    }

    // calculate matrix ^ pow, and use the result to update matrix value
    private void pow(long[][] matrix, int pow) {
        if (pow == 1) {
            return;
        }
        pow(matrix, pow/2);
        multiply(matrix, matrix);
        if (pow % 2 != 0) {
            multiply(matrix, SEED);
        }
    }

    // matrix multiplication and the result is updated to matrix itself
    private void multiply(long[][] matrix, long[][] multiplier) {
        long topLeft = matrix[0][0] * multiplier[0][0] + matrix[0][1] * multiplier[1][0];
        long topRight = matrix[0][0] * multiplier[0][1] + matrix[0][1] * multiplier[1][1];

        long bottomLeft = matrix[1][0] * multiplier[0][0] + matrix[1][1] * multiplier[1][0];
        long bottomRight = matrix[1][0] * multiplier[0][1] + matrix[1][1] * multiplier[1][1];

        matrix[0][0] = topLeft;
        matrix[0][1] = topRight;
        matrix[1][0] = bottomLeft;
        matrix[1][1] = bottomRight;
    }
}