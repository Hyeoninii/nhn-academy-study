//Quiz 4-9 prob 5
package quiz0409;

import java.util.function.DoubleUnaryOperator;

public class Prob5 {
    interface ArrayProcessor {
        double apply(double[] array);
    }

    public static void main(String[] args) {
        double[] numbers = {1.5, 2.5, 3.5, 4.5};

        ArrayProcessor max = array -> {
            double m = array[0];
            for(int i=1; i<array.length; i++) {
                if(array[i] > m) m = array[i];
            }
            return m;
        };

        ArrayProcessor min = array -> {
            double m = array[0];
            for(int i=1; i<array.length; i++) {
                if(array[i] < m) m = array[i];
            }
            return m;
        };

        ArrayProcessor sum = array -> {
            double s = 0;
            for(int i=0; i<array.length; i++) {
                s += array[i];
            }
            return s;
        };

        ArrayProcessor avg = array -> sum.apply(array) / array.length;

        ArrayProcessor count2_5 = counter(2.5);

        System.out.println("최댓값: " + max.apply(numbers));
        System.out.println("최솟값: " + min.apply(numbers));
        System.out.println("합계: " + sum.apply(numbers));
        System.out.println("평균: " + avg.apply(numbers));
        System.out.println("2.5의 개수: " + count2_5.apply(numbers));
    }

    public static ArrayProcessor counter(double value) {
        return array -> {
            int count = 0;
            for(int i=0; i<array.length; i++) {
                if(array[i] == value) count++;
            }
            return count;
        };
    }
}
