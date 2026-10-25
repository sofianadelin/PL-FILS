public class MatrixOperations {
    public static double[][] matrixAdd(double m1[][], double m2[][]) {
        int rows = m1.length;
        int cols = m1[0].length;

        double[][] result = new double[rows][cols];

        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
                result[i][j] = m1[i][j] + m2[i][j];

        return result;
    }

    public static double matrixDiagSum(double m1[][]) {
        double sum = 0;
        for(int i = 0; i < m1.length; i++) {
            sum += m1[i][i];
        }

        return sum;
    }

    public static void main(String[] args) {
        double[][] res = matrixAdd(new double[][]{{1, 2}}, new double[][]{{3, 4}});
        System.out.println(res[0][0] + " " + res[0][1]);

        double sum = matrixDiagSum(new double[][]{{1.5, 2.0}, {3.0, 4.5}});
        System.out.println(sum);
    }
}
