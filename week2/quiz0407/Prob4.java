//Quiz 4-7 prob 4
package quiz0407;

import java.awt.Color;

public class Prob4 {
    public static void main(String[] args) {
        Mosaic.open(10, 10, 25, 25);

        fillRandomColors();
    }

    public static void fillRandomColors() {
        for(int row=0; row<Mosaic.getRows(); row++) {
            for(int col=0; col<Mosaic.getColumns(); col++) {
                int red = (int)(Math.random() * 256);
                int green = (int)(Math.random() * 256);
                int blue = (int)(Math.random() * 256);
                Mosaic.setColor(row, col, new Color(red, green, blue));
            }
        }
    }
} 