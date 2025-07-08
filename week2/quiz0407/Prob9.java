package quiz0407;

import java.awt.Color;

public class Prob9 {
    public static void main(String[] args) {
        Mosaic.open(10, 10, 25, 25);
        
        animateRandomColors(100);
    }

    public static void animateRandomColors(int steps) {
        for(int step=0; step<steps; step++) {
            int row = (int)(Math.random() * Mosaic.getRows());
            int col = (int)(Math.random() * Mosaic.getColumns());
            int red = (int)(Math.random() * 256);
            int green = (int)(Math.random() * 256);
            int blue = (int)(Math.random() * 256);
            Mosaic.setColor(row, col, new Color(red, green, blue));
            Mosaic.delay(100);
        }
    }
} 