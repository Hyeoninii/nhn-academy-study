//Quiz 4-4 prob 11
package quiz0404;

public class Prob11 {
    public static void main(String[] args) {
        System.out.println(reverseString("this is test"));
    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
} 