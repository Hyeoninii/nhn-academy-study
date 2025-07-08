//Quiz 4-4 prob 8
package quiz0404;

public class Prob8 {
    public static void main(String[] args) {
        int[] arr = {2,1,5,4,3};
        int[] find = findMinMax(arr);
        System.out.println("최소값: " + find[0] + ", 최대값: " + find[1]);
    }
    public static int[] findMinMax(int[] numbers) {
        int [] minMax = {numbers[0], numbers[0]}; //min max

        for(int i=0; i<numbers.length; i++) {
            if(minMax[0]>numbers[i]) minMax[0] = numbers[i];
            if(minMax[1]<numbers[i]) minMax[1] = numbers[i];
        }
        return minMax;
    }
} 