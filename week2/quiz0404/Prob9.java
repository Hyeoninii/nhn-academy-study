//Quiz 4-4 prob 9
package quiz0404;

public class Prob9 {
    public static void main(String[] args) {
        System.out.println(divideNumbers(5, 2));        
    }
    public static double divideNumbers(double a, double b) {
        try {
            return a/b;
        } catch (ArithmeticException e) { throw new ArithmeticException(e.getMessage()); }
    }
} 