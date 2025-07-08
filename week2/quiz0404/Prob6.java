//Quiz 4-4 prob 6
package quiz0404;

import java.util.function.Supplier;

public class Prob6 {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> (int)(Math.random()*10);
        System.out.println("랜덤 숫자: " + randomNumber.get());

    }
} 