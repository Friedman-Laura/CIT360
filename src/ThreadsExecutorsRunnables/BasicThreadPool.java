package ThreadsExecutorsRunnables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura - sandbox code
 */

/* This is a basic way to use thread pools to manage multiple threads at the same time
 */

class ThreadPoolProcessor implements Runnable {
    
    private int id;
    
    public ThreadPoolProcessor(int id) {
        this.id = id;
    
    }
    
    public void run() {
        System.out.println("Initiating thread pool instance: " + id + "\n");
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadPoolProcessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Terminating thread pool instance: " + id + "\n");
    }
}
public class BasicThreadPool {
    
    public static void main(String[] args) {
        
        // ExecutorService will manages the number of tasks created in the thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);
    
        for(int i = 0; i < 15; i++) {
            executor.submit(new ThreadPoolProcessor(i));
        }
        
        executor.shutdown();
        
        System.out.println("************************************************"
                  + "\n" + "* All threads initiated in the pool.           *"
                  + "\n" + "************************************************\n");
        
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException ex) {
            Logger.getLogger(BasicThreadPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("************************************************"
                  + "\n" + "* All threads finished processing in the pool. *"
                  + "\n" + "************************************************\n");
    }
        
}
