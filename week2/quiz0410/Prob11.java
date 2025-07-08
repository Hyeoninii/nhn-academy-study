//Quiz 4-10 prob 11
package quiz0410;

public class Prob11 {
    public static void main(String[] args) {
        String text = "banana";
        char ch = 'a';
        System.out.println("개수: " + countChars(text, ch));
    }

    public static int countChars(String str, char c) {
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == c) count++;
        }
        return count;
    }
}
