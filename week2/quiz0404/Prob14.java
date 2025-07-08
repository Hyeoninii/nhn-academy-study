//Quiz 4-4 prob 14
package quiz0404;

public class Prob14 {
    public static void main(String[] args) {
        System.out.println(getRandomNumber(11, 33));
    }
    public static int getRandomNumber(int min, int max) {
        return (int)(Math.random()*(max-min+1))+min;
    }
} 