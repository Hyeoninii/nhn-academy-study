//Quiz 4-7 prob 7
package quiz0407;

import java.awt.Color;

public class Prob7 {
    public static void main(String[] args) {
        Mosaic.open(2, 2, 50, 50);
        Mosaic.setUse3DEffect(false);

        Mosaic.setColor(0, 0, Color.RED);
        Mosaic.setColor(1, 1, Color.BLUE);
        
        Mosaic.delay(1000);
        
        swapColors(0, 0, 1, 1);
        
        Mosaic.delay(2000);
    }

    public static void swapColors(int row1, int col1, int row2, int col2) {
        Color color1 = Mosaic.getColor(row1, col1);
        Color color2 = Mosaic.getColor(row2, col2);
        Mosaic.setColor(row1, col1, color2);
        Mosaic.setColor(row2, col2, color1);
    }
} 