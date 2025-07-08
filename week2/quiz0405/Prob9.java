//Quiz 4-5 prob 9
package quiz0405;

import java.util.Arrays;

public class Prob9 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};


        Arrays.stream(numbers)
            .filter(n -> n%2 != 0)
            .forEach(System.out::println);
    }

} 
