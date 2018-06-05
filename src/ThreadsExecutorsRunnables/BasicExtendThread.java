package ThreadsExecutorsRunnables;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura - sandbox code
 */

/* This is a basic way to create a three simple thread using "extends Thread" class method
*/
class ExtendThread extends Thread {

    @Override
    public void run() {
        // run each of the threads 20 times
        for (int i = 0; i < 20; i++) {
            System.out.println("This is loop " + i + " of a simple thread");

            try {
                // insert a 1 second delay
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ExtendThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

public class BasicExtendThread {

    public static void main(String[] args) {

        // Show all three loops running concurrently.

        // Create and run the first thread loop
        ExtendThread thread1 = new ExtendThread();
        thread1.start();

        // Create and run the second thread loop
        ExtendThread thread2 = new ExtendThread();
        thread2.start();

        // Create and run the third thread loop
        ExtendThread thread3 = new ExtendThread();
        thread3.start();
    }

}
