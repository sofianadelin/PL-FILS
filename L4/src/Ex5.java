import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] a = new int[5][7];
        int max = -1;

        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 7; j++)
                a[i][j] = rand.nextInt(101);

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 7; j++) {
                System.out.print(a[i][j] + " ");
                max = Math.max(a[i][j], max);
            }
            System.out.println();
        }

        System.out.println("max = " + max);

        for(int i = 0; i < 5; i++){
            int max_row = a[i][0];
            for(int j = 0; j < 7; j++) {
                max_row = Math.max(a[i][j], max_row);
            }
            System.out.println("max_row_" + i + " = " + max_row);
        }
    }
}


