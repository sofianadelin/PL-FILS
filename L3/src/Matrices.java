import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                    a[i][j] = scanner.nextInt();

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                b[i][j] = scanner.nextInt();

        int[][] sum = new int[3][3];
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                sum[i][j] = a[i][j] + b[i][j];

        int[][] multiplication = new int[3][3];

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++) {
                multiplication[i][j] = 0;
                for(int k = 0; k < 3; k++)
                    multiplication[i][j] += (a[i][k] * a[k][j]);
            }

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(multiplication[i][j] + " ");
            System.out.println();
        }

    }
}
