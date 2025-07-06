//Quiz 3-5 prob 6
package quiz0305;

import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월을 입력하세요 (1~12): ");
        int month = sc.nextInt();
        System.out.print("계절: ");
        switch(month){
            case 3:
            case 4:
            case 5: System.out.print("봄");
            case 6:
            case 7: 
            case 8:System.out.print("여름");
            case 9:
            case 10: 
            case 11: System.out.print("가을");
            case 12: 
            case 1:
            case 2: System.out.print("겨울");
            default:
        }
        sc.close();
    }
} 