//Quiz 4-4 prob 17
package quiz0404;

public class Prob17 {
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
    public static double power(double base, int exponent) {
        int result = 1;
        for(int i=0; i<exponent; i++) {
            result *= base;
        }
        return result;
    }
} 