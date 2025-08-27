package week_13;

public class MatrixMultiplication {
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int r1 = firstMatrix.length; //rows in first matrix
        int c1 = firstMatrix[0].length; // columns in first matrix
        int r2 = secondMatrix.length; //rows in second matrix
        int c2 = secondMatrix[0].length; // columns in second matrix

        if (c1 != r2) {
            System.out.println("Numbers and rows don't equal.");
            return null;
        }

        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{5, 6}, {7, 8}};

        int[][] product = multiplyMatrices(matrixA, matrixB);

        if (product != null) {
            System.out.println("Result");
            for (int[] row : product) {
                for (int element : row) {
                    System.out.println(element + " ");
                }
                System.out.println();
            }
        }
    }
}
