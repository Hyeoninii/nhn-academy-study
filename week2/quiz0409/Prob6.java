//Quiz 4-9 prob 6
package quiz0409;

import java.awt.Color;

public class Prob6 {
    public static void main(String[] args) {
        Mosaic.setUse3DEffect(false);
        Mosaic.open(20, 30, 15, 15);
        Mosaic.fill(Color.BLACK);

        while(Mosaic.isOpen()) {
            int row = (int)(Math.random() * 20);
            int col = (int)(Math.random() * 30);
            int r = Mosaic.getRed(row, col);
            int g = Mosaic.getGreen(row, col);
            int b = Mosaic.getBlue(row, col);
            if(g <= 230) g += 25;
            else g = 255;
            Mosaic.setColor(row, col, r, g, b);
            Mosaic.delay(10);
        }
    }
}
