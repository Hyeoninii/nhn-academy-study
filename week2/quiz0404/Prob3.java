//Quiz 4-4 prob 3
package quiz0404;

public class Prob3 {
    public static void main(String[] args) {
        java.util.function.Predicate<Integer> isEven = x -> x%2 == 0;
        System.out.println("4는 짝수인가? " + isEven.test(4));
        System.out.println("7는 짝수인가? " + isEven.test(7));
    }
} 