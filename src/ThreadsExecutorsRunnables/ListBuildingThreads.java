package ThreadsExecutorsRunnables;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura - sandbox Code
 */
/*  Having more than one intrinisic log so two different threads can 
*   write at the same time since they are not writing to the same list.
*   Create two different objects, lock1 and lock2 in this case.
 */
public class ListBuildingThreads {

    private Random random = new Random();

    /* These objects will be used by synchronize() to lock code execution of
     * other threads while each one finishes executing.
     */
    private Object lock1 = new Object();
    private Object lock2 = new Object();
    private Object lock3 = new Object();

    // Create three arrays that will hold a random set of integers.
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
    private List<Integer> list3 = new ArrayList<>();

    public void buildListOne() {

        // A synchronized object in Java means that only one thread can execute at a time.
        // All other threads are blocked until this synchronized object is finished executing.
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ListBuildingThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            list1.add(random.nextInt(1000));
        }
    }

    public void buildListTwo() {

        // A synchronized object in Java means that only one thread can execute at a time.
        // All other threads are blocked until this synchronized object is finished executing.
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ListBuildingThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            list2.add(random.nextInt(1000));
        }
    }

    public void buildListThree() {

        // A synchronized object in Java means that only one thread can execute at a time.
        // All other threads are blocked until this synchronized object is finished executing.
        synchronized (lock3) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ListBuildingThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            list3.add(random.nextInt(1000));
        }
    }

    public void processLists() {
        
        // Build 3 arrays with 25 random numbers in each array.
        for (int i = 0; i < 25; i++) {
            buildListOne();
            buildListTwo();
            buildListThree();
        }
    }

    public void main() {
        System.out.println("Starting the thread processor.\n");
        
        // Log the start time
        long start = System.currentTimeMillis();

        // Create the first thread to build the first instance of three arrays
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                processLists();
            }
        });

        // Create the second thread to build the second instance of three arrays
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                processLists();
            }
        });
        
        // Create the first thread to build the third instance of three arrays
        Thread t3 = new Thread(new Runnable() {

            @Override
            public void run() {
                processLists();
            }
        });

        // Begin execution of the first thread
        t1.start();

        // Begin execution of the second thread
        t2.start();

        // Begin execution of the third thread
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ListBuildingThreads.class.getName()).log(Level.SEVERE, null, ex);
        }

        long end = System.currentTimeMillis();

        System.out.println("Total time to execute 3 threads that each build 3 arrays: " + (end - start) + " milliseconds\n");
        System.out.println("Length of List1: " + list1.size() + "; Length of List2: " + list2.size() + "; Length of List3: " + list3.size() + "\n");
        System.out.println("*********************************************************************************************************"
                  + "\n" + "* Notice each array has 75 elements. That's because each of the three threads created all three arrays. *"
                  + "\n" + "*********************************************************************************************************\n");
        
        System.out.println("List1: " + list1 + "\n\nList2: " + list2 + "\n\nList3: " + list3); 
    }

}
