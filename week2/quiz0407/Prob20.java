//Quiz 4-7 prob 20
package quiz0407;

public class Prob20 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        // TODO: 서브루틴 호출
        int[] merged = mergeSortedArrays(array1, array2);

        // 결과 출력
        System.out.print("병합된 배열: ");
        for(int value : merged) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int[] merged = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        
        while(i < array1.length && j < array2.length) {
            if(array1[i] <= array2[j]) {
                merged[k++] = array1[i++];
            } else {
                merged[k++] = array2[j++];
            }
        }
        
        while(i < array1.length) {
            merged[k++] = array1[i++];
        }
        
        while(j < array2.length) {
            merged[k++] = array2[j++];
        }
        
        return merged;
    }

} 