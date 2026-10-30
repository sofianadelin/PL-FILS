public class Ex5 {

    public static void modify(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] S = new char[s.length()];
        int k = 0;

        while (i <= j) {
            S[k++] = s.charAt(i);
            i++;

            if (i <= j) {
                S[k++] = s.charAt(j);
                j--;
            }
        }
        System.out.println(S);
    }

    public static void main(String[] args) {
        modify("Hi there");
    }
}
