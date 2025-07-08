//Quiz 4-10 prob 12
package quiz0410;

public class Prob12 {
    public static void main(String[] args) {
        System.out.println(min(4, 9, 1));
    }

    public static int min(int a, int b, int c) {
        int m = a;
        if(b < m) m = b;
        if(c < m) m = c;
        return m;
    }
}
