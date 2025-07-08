//Quiz 4-4 prob 5
package quiz0404;

public class Prob5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sumArray(arr));
    }
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for(int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
} 