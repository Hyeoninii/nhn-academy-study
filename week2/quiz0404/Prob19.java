//Quiz 4-4 prob 19
package quiz0404;

public class Prob19 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        System.out.println(maxValue(a, b));
    }
    public static int maxValue(int a, int b) {
        if(a>b) return a;
        else return b;
    }
} 