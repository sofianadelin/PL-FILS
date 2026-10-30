public class Ex2 {
    public static boolean isPerfect(int x) {
        int s = 0;
        for(int d = 1; d <= x / 2; d++)
            if(x % d == 0) s += d;
        return s == x;
    }

    public static void main(String[] args) {
        System.out.println(isPerfect(6));
    }
}
