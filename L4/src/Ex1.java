import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[m + 1];

        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }

        for(int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        int[] c = new int[n + m + 1];
        int i = 0, j = 0, k = 0;
        while(i < n && j < m) {
            if(a[i] < b[j]) {
                c[k++] = a[i++];
            } else if(a[i] > b[j]) {
                c[k++] = b[j++];
            } else {
                c[k++] = a[i++];
                j++;
            }
        }
        while(i < n) {
            c[k++] = a[i++];
        }
        while(j < m) {
            c[k++] = b[j++];
        }
        for(int l = 0; l < k; l++){
            System.out.print(c[l] + " ");
        }

        scanner.close();
    }
}
