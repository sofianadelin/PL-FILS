import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int a, b, gcd = 1;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        int limit = Math.min(a, b);
        for(int i = 1; i <= limit; i++) {
            if(a % i == 0 &&  b % i == 0)
                    gcd = i;
        }

        System.out.println(gcd);

    }
}
