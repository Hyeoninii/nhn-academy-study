//Quiz 4-4 prob 7
package quiz0404;

public class Prob7 {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Hello from Runnable"); 
        };

        task.run();
    }
} 