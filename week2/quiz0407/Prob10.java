//Quiz 4-7 prob 10
package quiz0407;

public class Prob10 {
    public static void main(String[] args) {
        int[] numbers = {};

        try {
            validateArray(numbers);
            System.out.println("배열이 유효합니다.");
        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    public static void validateArray(int[] array) {
        if(array.length == 0) {
            throw new IllegalArgumentException("배열이 비어 있습니다.");
        }
    }
} 