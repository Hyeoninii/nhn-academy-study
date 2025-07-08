//Quiz 4-7 prob 16
package quiz0407;

public class Prob16 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 8, 25, 30};
        int threshold = 15;

        // TODO: 서브루틴 호출
        int[] filtered = filterGreaterThan(numbers, threshold);

        // 결과 출력
        System.out.print("필터링된 값: ");
        for (int value : filtered) {
            System.out.print(value + " ");
        }
    }

    public static int[] filterGreaterThan(int[] array, int threshold) {
        int count = 0;
        for(int value : array) {
            if(value > threshold) {
                count++;
            }
        }
        
        int[] filtered = new int[count];
        int index = 0;
        for(int value : array) {
            if(value > threshold) {
                filtered[index++] = value;
            }
        }
        return filtered;
    }
}