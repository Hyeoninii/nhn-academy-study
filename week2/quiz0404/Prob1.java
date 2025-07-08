//Quiz 4-4 prob 1
package quiz0404;

public class Prob1 {
    public static void main(String[] args) {
        java.util.function.Function<Integer, Integer> square = x -> x*x;
        System.out.println("5의 제곱: " + square.apply(5));
    }
}