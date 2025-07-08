//Quiz 4-10 prob 8
package quiz0410;

import java.util.Scanner;
import java.util.function.Supplier;

public class Prob8 {
    interface SupplyInt {
        int get();
    }

    public static void main(String[] args) {
        SupplyInt dice = () -> (int)(Math.random() * 6) + 1;
        SupplyInt userInput = () -> {
            Scanner sc = new Scanner(System.in);
            System.out.print("정수를 입력하세요: ");
            int num = sc.nextInt();
            sc.close();
            return num;
        };

        System.out.println("주사위 값: " + dice.get());
        System.out.println("입력한 값: " + userInput.get());
    }
}