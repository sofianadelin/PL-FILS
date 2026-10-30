public class Ex5 {

    public static void modify(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            System.out.print(s.charAt(i));
            i++;

            if (i <= j) {
                System.out.print(s.charAt(j));
                j--;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        modify("Hi there");
    }
}
