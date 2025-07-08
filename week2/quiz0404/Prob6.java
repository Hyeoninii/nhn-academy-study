//Quiz 4-4 prob 6
package quiz0404;

public class Prob6 {
    public static void main(String[] args) {
        countDown();
    }
    public static int countDown() {
        int i;
        for(i=10; i>0; i--) {
            System.out.print(i+" ");
        }
        return i;
    }
    
} 