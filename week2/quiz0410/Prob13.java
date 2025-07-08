//Quiz 4-10 prob 13
package quiz0410;

public class Prob13 {
    public static void main(String[] args) {
        double[] arr = {1.0, 2.0, 3.0, 4.0, 5.0};
        int n = 3;
        System.out.println(average(arr, n));
    }

    public static double average(double[] arr, int n) {
        double sum = 0;
        for(int i=0; i<n; i++) {
            sum += arr[i];
        }
        return sum / n;
    }
}
