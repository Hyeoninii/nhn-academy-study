//Quiz 4-4 prob 18
package quiz0404;

public class Prob18 {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5,2,7};
        System.out.println(findMax(arr));
    }
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for(int i=1; i<numbers.length; i++) {
            if(max<numbers[i]) max = numbers[i];
        }
        return max;
    }
} 