//Quiz 4-4 prob 3
package quiz0404;

public class Prob3 {
    public static void main(String[] args) {
        System.out.println(checkEvenOdd(13));
    }
    public static String checkEvenOdd(int number) {
        if(number%2==0) return "짝수";
        else return "홀수";
    }
} 