//Quiz 3-5 prob 7
package quiz0305;

import java.util.Scanner;

public class Prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 숫자를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                if(b>c){
                    System.out.println(c+" "+b+" "+a);
                }else{
                    System.out.println(b+" "+c+" "+a);
                }
            }
        }else{
            if(b>c){
                if(a>c){
                    System.out.println(c+" "+a+" "+b);
                }else{
                    System.out.println(a+" "+c+" "+b);
                }
            }
        }
        sc.close();
    }
} 