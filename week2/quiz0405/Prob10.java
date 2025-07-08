//Quiz 4-5 prob 10
package quiz0405;

import java.util.Arrays;

public class Prob10 {
    public static void main(String[] args) {
        String[] words = {"java", "lambda", "functional"};

        Arrays.stream(words)
            .map(s -> s.toUpperCase())
            .forEach(System.out::println);
    }
}

