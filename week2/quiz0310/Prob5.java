//Quiz 3-10 Prob 5
package quiz0310;

import textio.TextIO;

public class Prob5 {
    public static void main(String[] args) {
        TextIO.readFile("sales.dat");
        double sum = 0;
        int noDataCount = 0;

        while (!TextIO.eof()) {
            String city = TextIO.getln();
            int colonIndex = city.indexOf(':');
            if (colonIndex == -1) continue;

            String data = city.substring(colonIndex + 1).trim();
            try {
                double value = Double.parseDouble(data);
                sum += value;
            } catch (NumberFormatException e) {
                noDataCount++;
            }
        }

        System.out.println("모든 도시의 판매 총액: " + sum);
        System.out.println("데이터가 없는 도시의 개수: " + noDataCount);
    }
}
