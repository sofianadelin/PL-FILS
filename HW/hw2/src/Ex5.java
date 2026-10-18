import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;

        n = scanner.nextInt();
        m = scanner.nextInt();

        int[][] a = new int[n+1][m+1];
        for(int i = 1; i <= n; i++)
            for(int j = 1; j <= m; j++)
                a[i][j] = scanner.nextInt();

        // row-wise sum
        for(int i = 1; i <= n; i++) {
            int s = 0;
            for(int j = 1; j <= m; j++) {
                s += a[i][j];
            }
            System.out.printf("row %d has sum: %d%n", i, s);
        }

        System.out.println();

        // column-wise sum
        for(int j = 1; j <= m; j++) {
            int s = 0;
            for(int i = 1; i <= n; i++) {
                s += a[i][j];
            }
            System.out.printf("column %d has sum: %d%n", j, s);
        }

        int[][] t = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++)
                t[i][j] = a[j][i];
        }

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++)
                System.out.print(t[i][j] + " ");
            System.out.println();
        }


    }
}
