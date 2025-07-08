//Quiz 4-4 prob 5
package quiz0404;

import java.util.Arrays;
import java.util.List;


public class Prob5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        java.util.function.Consumer<Integer> printElement = i -> System.out.print(i+" ");
        numbers.forEach(printElement);
        System.out.println();
    }
    
} 