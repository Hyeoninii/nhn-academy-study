package quiz0407;

//Quiz 4-7 prob 2
public class Prob2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        boolean sorted = isSorted(numbers);

        System.out.println("배열 정렬 여부: " + sorted);
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
} 