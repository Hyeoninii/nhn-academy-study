//Quiz 4-10 prob 10
package quiz0410;

public class Prob10 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            stars(i);
        }
    }

    public static void stars(int n) {
        for(int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
