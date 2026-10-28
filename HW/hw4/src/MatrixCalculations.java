import java.util.Arrays;

public class MatrixCalculations {
    public static int sumMainDiagonal(int m[][]) {
        int size = m.length, s = 0;
        for(int i = 0; i < size; i++) {
            s += m[i][i];
        }
        return s;
    }

    public static int sumUnderMainDiagonal(int m[][]) {
        int size = m.length, s = 0;
        for(int i = 0; i < size; i++)
            for(int j = 0; j < size; j++) {
                    if(i >= j)
                        s += m[i][j];
            }
        return s;
    }

    public static int[][] matrixMultiplication(int a[][], int b[][]) {
        // can be multiplied if nr of columns of the first matrix is equal to the number of lines of the second matrix
        int l1 = a.length, c1 = a[0].length;
        int l2 = b.length, c2 = b[0].length;
        int[][] c = new int[l1][c2];
        if (c1 != l2) return null;
        for(int i = 0; i < l1; i++) {
            for(int j = 0; j < c2; j++) {
                for(int k = 0; k < c1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }

    public static void main(String[] args) {
        int[][] m = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] a = {
                {1, 2},
                {3, 4}
        };

        int[][] b = {
                {5, 6},
                {7, 8}
        };

        System.out.println(sumMainDiagonal(m));
        System.out.println(sumUnderMainDiagonal(m));
        System.out.println(Arrays.deepToString(matrixMultiplication(a, b)));
    }
}
