//Quiz 4-5 prob 13
package quiz0405;

import java.util.Optional;

public class Prob13 {
     public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Hello");

        // TODO: Optional 값 처리 람다 작성
        optionalValue.ifPresentOrElse( 
           s -> System.out.println(s), () -> System.out.println("is Empty")
        );
    }

} 
