package ThreadsExecutorsRunnables;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura - sandbox code
 */

/* This is a basic way to create a three simple thread using "implements Runnable"
 * class method and passing it to a constructor of the thread class
*/ 
class ImplementRunner implements Runnable {
    public void run() {
        // run each of the threads 20 times
        for (int i = 0; i < 20; i++) {
            System.out.println("This is loop " + i + " of a thread using a constructor");

            try {
                // insert a 1 second delay
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ImplementRunner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

public class BasicImplementsRunnable {
    
    public static void main(String[] args) {
        
        // Show all three loops running concurrently.
        
        // For each thread, pass an instance of the Runner class to the constructor
        
        // Create the first thread loop
        Thread thread1 = new Thread(new ImplementRunner());
        thread1.start();

        // Create the second thread loop
        Thread thread2 = new Thread(new ImplementRunner());
        thread2.start();

        // Create the third thread loop
        Thread thread3 = new Thread(new ImplementRunner());
        thread3.start();
    }
    
}
