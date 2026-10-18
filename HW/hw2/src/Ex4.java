import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        // n = linii

        // i)
        for(int i = 1; i <= n; i++) {
            System.out.print('\n');
            for(int j = 1; j <= 10; j++)
                System.out.print("*");
        }
        System.out.println();
        System.out.println();

        // ii)
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i >= j)
                    System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // iii)

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i + j >= n + 1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // iv)
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            for(int k = 0; k < 2 * i + 1; k++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // v)
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            for(int k = 0; k < 2 * i + 1; k++)
                System.out.print(i + 1);
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // vi)
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            int cnt = i + 1, direction = -1;
            for(int k = 0; k < (2 * i + 1); k++){
                System.out.print(cnt);
                if(cnt == 1) direction = 1;
                cnt += direction;
            }
            System.out.println();
        }
    }
}
