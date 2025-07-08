//Quiz 4-9 prob 4
package quiz0409;

import java.util.Random;

public class Prob4 {
    public static void main(String[] args) {
        for(int total=2; total<=12; total++) {
            double average = getAverageRolls(total, 10000);
            System.out.printf("%7d%26.4f%n", total, average);
        }
    }

    public static int countRollsToGetTotal(int target) {
        Random rand = new Random();
        int count = 0;
        while(true) {
            int d1 = rand.nextInt(6) + 1;
            int d2 = rand.nextInt(6) + 1;
            count++;
            if(d1 + d2 == target) break;
        }
        return count;
    }

    public static double getAverageRolls(int target, int trials) {
        int sum = 0;
        for(int i=0; i<trials; i++) {
            sum += countRollsToGetTotal(target);
        }
        return (double)sum / trials;
    }
}
