//Quiz 4-7 prob 11
package quiz0407;

public class Prob11 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};

        int[][] result = addMatrices(matrix1, matrix2);

        for(int[] row : result) {
            for(int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        if(mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
            throw new IllegalArgumentException("행렬의 크기가 다릅니다.");
        }
        
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];
        
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }
} 