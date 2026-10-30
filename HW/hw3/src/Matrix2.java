import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    sum1 += matrix[i][j];
                }
                if (j > i) {
                    sum2 += matrix[i][j];
                }
                if (i + j > n - 1) {
                    sum3 += matrix[i][j];
                }
            }
        }

        System.out.println("secondary diagonal sum: " + sum1);
        System.out.println("above primary diagonal sum: " + sum2);
        System.out.println("under secondary diagonal sum: " + sum3);
    }
}