//Quiz 4-4 prob 16
package quiz0404;

public class Prob16 {
    public static void main(String[] args) {
        System.out.println(getSeason(3));
    }
    public static String getSeason(int month) {
        switch(month) {
            case 3:
            case 4:
            case 5: return "봄";
            case 6:
            case 7:
            case 8: return "여름";
            case 9:
            case 10:
            case 11: return "가을";
            case 12:
            case 1:
            case 2: return "겨울";
            default:
                return "잘못된 입력";
        }
    }
} 