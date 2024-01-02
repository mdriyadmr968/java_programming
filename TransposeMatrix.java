public class TransposeMatrix {

    public static void transposeMatrix(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("The matrix is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30}, {15, 25, 33}};

        transposeMatrix(matrix);
    }
}