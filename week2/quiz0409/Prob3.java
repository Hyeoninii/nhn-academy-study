//Quiz 4-9 prob 3
package quiz0409;

import java.util.Random;
import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int count = countRollsToGetTotal(target);
        System.out.println("굴린 횟수: " + count);
        sc.close();
    }

    public static int countRollsToGetTotal(int target) {
        if(target < 2 || target > 12) {
            throw new IllegalArgumentException("2부터 12 사이의 값이어야 합니다.");
        }
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
}
