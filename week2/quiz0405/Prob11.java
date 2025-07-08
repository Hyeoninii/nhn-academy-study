//Quiz 4-5 prob 11
package quiz0405;

import java.util.Arrays;

public class Prob11 {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "kiwi", "grape"};

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        System.out.println(Arrays.toString(words)); // 출력: [kiwi, grape, apple, banana]
    }

} 
