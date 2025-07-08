//Quiz 4-4 prob 15
package quiz0404;

import java.time.LocalDate;

public class Prob15 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2024, 1, 1);
        LocalDate d2 = LocalDate.of(2024, 1, 31);
        System.out.println(daysBetween(d1, d2));
    }
    public static long daysBetween(LocalDate start, LocalDate end) {
        return end.toEpochDay() - start.toEpochDay();
    }
} 