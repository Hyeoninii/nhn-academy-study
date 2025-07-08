//Quiz 4-5 prob 4
package quiz0405;

public class Prob4 {
    public static void main(String[] args) {
    java.util.function.BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
    System.out.println("5 + 10 = " + add.apply(5, 10));
    }
} 
