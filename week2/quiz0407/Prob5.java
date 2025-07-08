//Quiz 4-7 prob 5
package quiz0407;

import java.awt.Color;

public class Prob5 {
     static int currentRow = 5;
    static int currentCol = 5;

    public static void main(String[] args) {
        Mosaic.open(10, 10, 25, 25);

        for (int i = 0; i < 50; i++) {
            randomMove();
        }

        System.out.println("최종 위치: (" + currentRow + ", " + currentCol + ")");
    }

    public static void randomMove() {
        int direction = (int)(Math.random() * 4);
        switch(direction) {
            case 0: // 위
                if(currentRow > 0) currentRow--;
                break;
            case 1: // 아래
                if(currentRow < Mosaic.getRows() - 1) currentRow++;
                break;
            case 2: // 왼쪽
                if(currentCol > 0) currentCol--;
                break;
            case 3: // 오른쪽
                if(currentCol < Mosaic.getColumns() - 1) currentCol++;
                break;
        }
        Mosaic.setColor(currentRow, currentCol, Color.BLUE);
    }

} 