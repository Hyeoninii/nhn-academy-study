//Quiz 4-5 prob 3
package quiz0405;

public class Prob3 {
    public static void main(String[] args) {
        java.util.function.Predicate<Integer> isEven = x -> x%2 == 0;
        System.out.println("4는 짝수인가? " + isEven.test(4));
        System.out.println("7은 짝수인가? " + isEven.test(7));
    }
} 
