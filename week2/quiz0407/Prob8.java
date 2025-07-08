//Quiz 4-7 prob 8
package quiz0407;

public class Prob8 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 8, 6};

        int max = findMax(numbers);

        System.out.println("최대값: " + max);
    }

    public static int findMax(int[] array) {
        if(array.length == 0) {
            throw new IllegalArgumentException("배열이 비어 있습니다.");
        }
        int max = array[0];
        for(int i=1; i<array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
} 