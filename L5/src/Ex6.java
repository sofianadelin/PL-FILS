public class Ex6 {
    public static boolean palindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i <= j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }

    public static boolean palindromeR(String s, int i) {
        if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        else return palindromeR(s, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(palindrome("abccba"));
        System.out.println(palindrome("aba"));
        System.out.println(palindrome("abc"));
    }
}
