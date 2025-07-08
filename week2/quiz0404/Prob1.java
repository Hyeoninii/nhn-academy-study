//Quiz 4-4 prob 1
package quiz0404;

public class Prob1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println("빗변: " + pythagoras(a, b));
    }
    
    public static double pythagoras(double x, double y) {
        return(Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2))));
    }
} 