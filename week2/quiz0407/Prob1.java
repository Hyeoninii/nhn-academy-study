//Quiz 4-7 prob 1
package quiz0407;

public class Prob1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // TODO: 서브루틴 호출
        double average = calculateAverage(numbers);

        System.out.println("평균: " + average);
    }
    public static double calculateAverage(int[] array) {
        if(array.length == 0) {
            throw new IllegalArgumentException("배열이 비어 있습니다.");
        }
        double avg = 0;
        for(int i=0; i<array.length; i++) {
            avg += array[i];
        }
        avg /= array.length;
        return avg;
    }
}
