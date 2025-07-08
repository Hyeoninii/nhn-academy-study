//Quiz 4-7 prob 15
package quiz0407;

public class Prob15 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // TODO: 서브루틴 호출
        int[][] rotated = rotateMatrix(matrix);

        // 결과 출력
        for (int[] row : rotated) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] rotated = new int[cols][rows];
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                rotated[j][rows - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }

} 