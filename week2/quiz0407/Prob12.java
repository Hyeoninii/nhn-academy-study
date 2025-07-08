//Quiz 4-7 prob 12
package quiz0407;

import java.awt.Color;

public class Prob12 {
    public static void main(String[] args) {
        Mosaic.open(5, 5, 25, 25);

        fillRandomColors();

        int[] avgColor = calculateAverageColor(0, 0, 4, 4);
        System.out.println("평균 색상: R=" + avgColor[0] + ", G=" + avgColor[1] + ", B=" + avgColor[2]);
    }

    public static int[] calculateAverageColor(int startRow, int startCol, int endRow, int endCol) {
        int totalRed = 0, totalGreen = 0, totalBlue = 0;
        int count = 0;
        
        for(int row = startRow; row <= endRow; row++) {
            for(int col = startCol; col <= endCol; col++) {
                Color color = Mosaic.getColor(row, col);
                totalRed += color.getRed();
                totalGreen += color.getGreen();
                totalBlue += color.getBlue();
                count++;
            }
        }
        
        return new int[]{totalRed / count, totalGreen / count, totalBlue / count};
    }

    public static void fillRandomColors() {
        for(int row = 0; row < Mosaic.getRows(); row++) {
            for(int col = 0; col < Mosaic.getColumns(); col++) {
                int red = (int)(Math.random() * 256);
                int green = (int)(Math.random() * 256);
                int blue = (int)(Math.random() * 256);
                Mosaic.setColor(row, col, new Color(red, green, blue));
            }
        }
    }

} 