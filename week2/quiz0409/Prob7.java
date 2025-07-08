//Quiz 4-9 prob 7
package quiz0409;

public class Prob7 {
    public static void main(String[] args) {
        Mosaic.setUse3DEffect(false);
        Mosaic.open(20, 20, 15, 15);
        Mosaic.fillRandomly();

        while(Mosaic.isOpen()) {
            int row = (int)(Math.random() * 20);
            int col = (int)(Math.random() * 20);
            int neighbor = (int)(Math.random() * 4);
            int r = row;
            int c = col;
            if(neighbor == 0 && row > 0) r--;
            else if(neighbor == 1 && row < 19) r++;
            else if(neighbor == 2 && col > 0) c--;
            else if(neighbor == 3 && col < 19) c++;
            Mosaic.setColor(row, col, Mosaic.getColor(r, c));
            Mosaic.delay(10);
        }
    }
}
