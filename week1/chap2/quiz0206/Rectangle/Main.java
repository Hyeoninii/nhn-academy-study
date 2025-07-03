package Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        Rectangle r = new Rectangle(a, b);
        System.out.println(r.Area());
    }
}