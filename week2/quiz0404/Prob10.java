//Quiz 4-4 prob 10
package quiz0404;

public class Prob10 {
    public static void main(String[] args) {
        System.out.println(getGrade(90));
    }
    public static char getGrade(int score) {
        if(score>=90) {
            return 'A';
        } else if(score>=80) {
            return 'B';
        } else if(score>=70) {
            return 'C';
        } else {
            return 'F';
        }
    }
} 