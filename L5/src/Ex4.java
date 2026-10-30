public class Ex4 {
    public static int countChars(String s, char c) {
        int count = 0;
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == c) {
                count++;
            }
        return count;
    }

    public static int countCharsR(String s, char c, int index) {
        if(index == s.length()) return 0;
        else {
            if(s.charAt(index) == c) return 1 + countCharsR(s, c, index + 1);
            else return countCharsR(s, c, index + 1);
        }
    }


    public static void main(String[] args) {
        System.out.println(countCharsR("abcabcabc", 'a', 0));
    }
}
