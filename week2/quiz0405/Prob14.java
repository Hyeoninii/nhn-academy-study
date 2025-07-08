//Quiz 4-5 prob 14
package quiz0405;

import java.util.HashMap;
import java.util.Map;

public class Prob14 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // TODO: 람다와 forEach를 사용하여 키-값 출력
        map.forEach((a, b) -> System.out.println(b));
    }

} 
