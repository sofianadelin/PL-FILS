public class IsPrime {
    public static boolean isPrime(int nr) {
        if(nr < 2) return false;
        if(nr == 2) return true;
        if(nr % 2 == 0) return false;
        for(int d = 3; d * d <= nr; d += 2)
            if ( nr % d == 0 ) return false;
        return true;
    }



    public static void main(String[] args) {
        System.out.println(isPrime(17));
        System.out.println(isPrime(18));


    }
}
