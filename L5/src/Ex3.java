public class Ex3 {
    public static int match(String s1, String s2) {
        int current_index = 0, count = 0;
        while((current_index = s2.indexOf(s1, current_index)) != -1)  {
            count++;
            current_index += s1.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String s1 = "str";
        String s2 = "string1 and string2 gives string3";
        System.out.println(match(s1, s2));
    }
}
