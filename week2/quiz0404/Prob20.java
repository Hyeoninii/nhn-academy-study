//Quiz 4-4 prob 20
package quiz0404;

public class Prob20 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5};
        System.out.println(averageValue(arr));
    }
    public static double averageValue(int[] numbers) {
        double sum = 0;
        for(int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        return sum/numbers.length;
    }
} 