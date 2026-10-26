import java.util.StringTokenizer;

public class Ex2 {
    public static void main(String[] args) {
        String s = "john, bobby, tom, alexander, michael, gabriel, andrew, charles, dan, corey";
        StringTokenizer st = new StringTokenizer(s, ",");
        String[] names = new String[st.countTokens()];
        int k = 0;
        while(st.hasMoreTokens()) {
            String token = st.nextToken().trim();
            names[k] = token;
            k++;
        }

        for(int i = 0; i < names.length - 1; i++)
            for(int j = i; j < names.length; j++)
                // names[i] > names[j]
                if(names[i].compareTo(names[j]) > 0) {
                    String aux = names[j];
                    names[j] = names[i];
                    names[i] = aux;
                }

        for(int i = 0; i < names.length; i++)
            System.out.println(names[i]);

    }
}
