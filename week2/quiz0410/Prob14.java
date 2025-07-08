//Quiz 4-10 prob 14
package quiz0410;

//stripZeros는 입력받은 배열에서 0을 제거한 새 배열을 리턴한다.
public class Prob14 {
    static int[] stripZeros(int[] list) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0)
                count++;
        }
        int[] newList;
        newList = new int[count];
        int j = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0) {
                newList[j] = list[i];
                j++;
            }
        }
        return newList;
    }
}
