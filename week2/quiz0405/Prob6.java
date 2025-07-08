//Quiz 4-5 prob 6
package quiz0405;

import java.util.function.Supplier;

public class Prob6 {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> (int)(Math.random()*10);
        System.out.println("랜덤 숫자: " + randomNumber.get());

    }
} 