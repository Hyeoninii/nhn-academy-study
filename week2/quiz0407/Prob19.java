//Quiz 4-7 prob 19
package quiz0407;

public class Prob19 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // TODO: 서브루틴 호출
        int diagonalSum = sumDiagonal(matrix);

        System.out.println("대각선 요소의 합: " + diagonalSum);
    }

    public static int sumDiagonal(int[][] matrix) {
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

} 