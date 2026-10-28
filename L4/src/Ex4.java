import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int[] a = new int[n+1];

        for(int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }

        int max_l = 0;
        int current_l = 0;
        int i = 1, index = 1;
        while(i <= n) {
            int x = a[i];

            if(x > 0) {
                current_l++;
                if(current_l > max_l) {
                    max_l = current_l;
                    index = i - max_l + 1;
                }
            } else {
                current_l = 0;
            }
            i++;
        }


        if(max_l == 0) {
            System.out.println("no positive sequence found");
        } else {
            System.out.println(index + " " + max_l);
        }
        scanner.close();
    }
}
