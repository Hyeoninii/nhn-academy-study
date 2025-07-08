//Quiz 4-7 prob 14
package quiz0407;

public class Prob14 {
    public static void main(String[] args) {
        int[] color1 = {255, 0, 0}; // 빨강
        int[] color2 = {0, 0, 255}; // 파랑

        // TODO: 서브루틴 호출
        int[] mixedColor = combineColors(color1, color2);

        System.out.println("혼합 색상: R=" + mixedColor[0] + ", G=" + mixedColor[1] + ", B=" + mixedColor[2]);
    }

    public static int[] combineColors(int[] color1, int[] color2) {
        int red = (color1[0] + color2[0]) / 2;
        int green = (color1[1] + color2[1]) / 2;
        int blue = (color1[2] + color2[2]) / 2;
        return new int[]{red, green, blue};
    }

} 