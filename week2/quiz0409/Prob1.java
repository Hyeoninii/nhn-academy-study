//Quiz 4-9 prob 1
package quiz0409;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printCapitalized(input);
        sc.close();
    }

    public static void printCapitalized(String str) {
        boolean newWord = true;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLetter(ch)) {
                if(newWord) {
                    System.out.print(Character.toUpperCase(ch));
                    newWord = false;
                } else {
                    System.out.print(ch);
                }
            } else {
                System.out.print(ch);
                newWord = true;
            }
        }
        System.out.println();
    }
}
