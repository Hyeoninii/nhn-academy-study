//Quiz 4-7 prob 17
package quiz0407;

public class Prob17 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // TODO: 서브루틴 호출
        int totalSum = sumMatrix(matrix);

        System.out.println("배열 요소의 합: " + totalSum);
    }

    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

} 