public class MatrixGenerators {
    public static int[][] matrix1(int size) {
        int[][] m = new int[size][size];
        int cnt = 1;
        for(int i = 0; i < size; i++)
            for(int j = 0; j < size; j++)
                m[i][j] = cnt++;

        return m;
    }

    public static int[][] matrix2(int size) {
        int[][] m = new int[size][size];
        int cnt = 1;
        for(int i = 0; i < size; i++)
            for(int j = 0; j < size; j++)
                m[j][i] = cnt++;

        return m;
    }

    public static int[][] matrix3(int size) {
        int[][] m = new int[size][size];
        for(int i = 0; i < size; i++)
            for(int j = 0; j < size; j++)
                if(i % 2 == 0) {
                    m[i][j] = size * i + (j + 1);
                } else {
                    m[i][j] = size * (i + 1) - j;
                }
        return m;
    }

    public static int[][] matrix4(int size) {
        int[][] m = new int[size][size];
        int cnt = 1;
        for(int i = 0; i < size/2; i++) {
            int top = i;
            int left = i;
            int bottom = size - i - 1;
            int right = size - i - 1;

            for(int j = left; j <= right; j++) {
                m[top][j] = cnt++;
            }
            for(int j = top + 1; j <= bottom; j++) {
                m[j][right] = cnt++;
            }
            for(int j = right - 1; j >= left; j--) {
                m[bottom][j] = cnt++;
            }
            for(int j = bottom - 1; j >= top + 1; j--) {
                m[j][left] = cnt++;
            }
        }

        if (size % 2 != 0) {
            int mid = (size) / 2;
            m[mid][mid] = cnt++;
        }

        return m;
    }

    public static void main(String[] args) {
        int[][] m = new int[4][4];
        m = matrix4(4);
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}
