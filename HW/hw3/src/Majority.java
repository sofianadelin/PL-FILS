import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        int max = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }

        int[] f = new int[max + 1];

        for (int i : A) {
            f[A[i]]++;
        }

        int majority = -1;
        for (int i = 0; i <= max; i++) {
            if (f[i] > n / 2) {
                majority = i;
                break;
            }
        }

        if (majority != -1) {
            System.out.println(majority);
        } else {
            System.out.println("no");
        }
    }
}