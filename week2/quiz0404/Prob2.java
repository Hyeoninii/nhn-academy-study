//Quiz 4-4 prob 2
package quiz0404;

public class Prob2 {
    public static void main(String[] args) {
        nextN(3);
    }
    public static int nextN(int currentN) {
        System.out.print(currentN+ " ");
        if(currentN==1) return 1;

        if(currentN%2==0) {
            return nextN(currentN/2);
        } else {
            return nextN(currentN*3+1);
        }
    }
} 