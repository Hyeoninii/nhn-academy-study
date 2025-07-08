//Quiz 4-7 prob 6
package quiz0407;

public class Prob6 {
    public static void main(String[] args) {
        int a = 10, b = 2;

        int result = divide(a, b);

        System.out.println(a + " / " + b + " = " + result);
    }

    public static int divide(int numerator, int denominator) {
        if(denominator == 0) {
            throw new IllegalArgumentException("divide by 0.");
        }
        return numerator / denominator;
    }
} 