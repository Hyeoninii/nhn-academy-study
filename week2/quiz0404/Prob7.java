//Quiz 4-4 prob 7
package quiz0404;

public class Prob7 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("teet"));
    }
    public static boolean isPalindrome(String str) {
        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++) {
            if(arr[i]!=arr[arr.length-1-i]) {
                return false;
            }
        }
        return true;
    }
} 