//Quiz 4-7 prob 3
package quiz0407;

import java.awt.Color;

public class Prob3 {
    public static void main(String[] args) {
        Mosaic.open(10, 10, 25, 25);
        Mosaic.setUse3DEffect(false);

        fillWithRed();
    }

    public static void fillWithRed() {
        for(int i=0; i<Mosaic.getRows(); i++) {
            for(int j=0; j<Mosaic.getColumns(); j++) {
                Mosaic.setColor(i, j, Color.RED);
            }
        }
    }
}