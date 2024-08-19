public class MatrixOperations {
    public static int[] matrixOperations(int[][] A) {
        int n = A.length;
        int NUM = 0;
        int SUM = 0;
        int PROD = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] != 0) {
                    NUM += 1;
                }
                if (i < j) {
                    SUM += A[i][j];
                }
            }
            PROD *= A[i][i];  // Diagonal element multiplication
        }

        return new int[] {NUM, SUM, PROD};
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 0},
            {0, 3, 4},
            {5, 0, 6}
        };

        int[] result = matrixOperations(A);
        System.out.println("Number of non-zero elements: " + result[0]);
        System.out.println("Sum of elements above diagonal: " + result[1]);
        System.out.println("Product of diagonal elements: " + result[2]);
    }
}
