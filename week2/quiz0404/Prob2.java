//Quiz 4-4 prob 2
package quiz0404;

public class Prob2 {
    public static void main(String[] args) {
    
        java.util.function.Function<String, Integer> stringLength = s -> s.length();

        System.out.println("문자열 길이: " + stringLength.apply("Hello Lambda"));
    }
} 