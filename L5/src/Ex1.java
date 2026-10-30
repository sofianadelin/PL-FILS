public class Ex1 {
    public static boolean isPrime(int n) {
        if(n % 2 == 0 && n != 2) return false;
        if(n < 2) return false;
        if(n == 2) return true;

        for(int d = 3; d * d <=n; d+=2) {
            if(n % d == 0) return false;
        }

        return true;
    }

    public static void genPrimes(int n) {
        boolean[] ciur = new boolean[n + 1];
        ciur[1] = ciur[0] = true;
        for(int j = 2; j * j <= n; j++) {
            if(!ciur[j]) {
                for(int i = j; i * j <= n; i++)
                    ciur[i * j] = true;
            }
        }

        for(int i = 1; i <= n; i++) {
            if(!ciur[i]) System.out.print(i + " ");
        }
    }

    public static boolean allPrimeDivisors(int n) {
        boolean flag = true;
        if(n <= 1) return false;
        for (int d = 2; (long) d <= n / 2; d++) {
            if (n % d == 0) {
                if(!isPrime(d)) return false;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(4));
        System.out.println(isPrime(13));

        genPrimes(20);
        System.out.println();

        System.out.println(allPrimeDivisors(1));
        System.out.println(allPrimeDivisors(15));
        System.out.println(allPrimeDivisors(13));
    }
}
