//Quiz 4-4 prob 4
package quiz0404;

public class Prob4 {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

    for (int i = 3; i <= Math.sqrt(number); i += 2) {
        if (number % i == 0) return false;
    }
    return true;
    }
} 