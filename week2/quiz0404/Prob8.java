//Quiz 4-4 prob 8
package quiz0404;

@FunctionalInterface
interface MaxFinder {
    int findMax(int a, int b);
}


public class Prob8 {
    public static void main(String[] args) {
        MaxFinder maxFinder = (a, b) -> Math.max(a, b);
        System.out.println("큰 값: " + maxFinder.findMax(5, 10));
    }
} 