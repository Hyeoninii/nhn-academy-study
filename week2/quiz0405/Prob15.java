//Quiz 4-5 prob 15
package quiz0405;

import java.util.Arrays;
import java.util.List;

public class Prob15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // TODO: 람다와 스트림 API를 사용하여 짝수 제곱 출력
        numbers.stream()
            .filter(n -> n%2 != 0) // TODO: 짝수 필터 조건 작성
            .map(n -> n*n) // TODO: 제곱 람다 작성
            .forEach(System.out::println);
    }

} 
