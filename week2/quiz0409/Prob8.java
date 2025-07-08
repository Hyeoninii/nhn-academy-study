//Quiz 4-9 prob 8
package quiz0409;

import java.util.Scanner;

public class Prob8 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] ans = new int[10];

        makeQuiz(a, b);
        getAnswers(a, b, ans);
        grade(a, b, ans);
    }

    public static void makeQuiz(int[] a, int[] b) {
        for(int i=0; i<a.length; i++) {
            a[i] = (int)(Math.random() * 50 + 1);
            b[i] = (int)(Math.random() * 50 + 1);
        }
    }

    public static void getAnswers(int[] a, int[] b, int[] ans) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<a.length; i++) {
            System.out.printf("%d + %d = ", a[i], b[i]);
            ans[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void grade(int[] a, int[] b, int[] ans) {
        int score = 0;
        for(int i=0; i<a.length; i++) {
            int correct = a[i] + b[i];
            if(ans[i] == correct) {
                score++;
            } else {
                System.out.printf("문제 %d: 오답 (정답: %d)%n", i+1, correct);
            }
        }
        System.out.println("총 점수: " + score + " / 10");
    }
}
