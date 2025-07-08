//Quiz 4-9 prob 2
package quiz0409;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            int result = hexStringToDecimal(input);
            System.out.println(result);
        } catch(IllegalArgumentException e) {
            System.out.println("유효하지 않은 16진수 문자열입니다.");
        }
        sc.close();
    }

    public static int hexValue(char ch) {
        switch(ch) {
            case '0': case '1': case '2': case '3': case '4':
            case '5': case '6': case '7': case '8': case '9':
                return ch - '0';
            case 'A': case 'a': return 10;
            case 'B': case 'b': return 11;
            case 'C': case 'c': return 12;
            case 'D': case 'd': return 13;
            case 'E': case 'e': return 14;
            case 'F': case 'f': return 15;
            default: return -1;
        }
    }

    public static int hexStringToDecimal(String str) {
        int result = 0;
        for(int i=0; i<str.length(); i++) {
            int value = hexValue(str.charAt(i));
            if(value == -1) throw new IllegalArgumentException();
            result = result * 16 + value;
        }
        return result;
    }
}
