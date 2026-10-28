import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n+1];

        for(int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        Arrays.sort(a, 1, n+1);
        for(int i = 1; i <= n - 2; i++) {
            if(i > 1 && a[i] == a[i-1]) {
                continue;
            }

            int left = i + 1;
            int right = n;

            while(left < right) {
                int currentSum = a[i] + a[left] + a[right];
                if(currentSum == target) {
                    System.out.println("(" + a[i] + " " + a[left] + " " + a[right] + ")");
                    while(left < right && a[left] == a[left+  1]) left++;
                    while(left < right && a[right] == a[right - 1]) right--;

                    left++;
                    right--;
                } else if(currentSum < target) {
                    left++;
                } else right--;
            }
        }
    }
}
