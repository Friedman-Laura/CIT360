package JavaCollections;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Deque;

/**
 *
 * @author Laura - sandbox code
 */

public class CollectionsQueue {
    public static void main(String[] args) {
    
        // create a new queue of baseball teams
        Queue<String> teams = new LinkedList<>();
        teams.add("Texas Rangers");
        teams.add("New York Yankees");
        teams.add("Boston Red Sox");
        teams.add("Washington Nationals");
        teams.add("Houston Astros");
        teams.add("Detroit Tigers");
        teams.add("Chicago White Sox");
        teams.add("Oakland Athletics");
        teams.add("Seattle Mariners");
        teams.add("Tampa Bay Rays");
        teams.add("California Angels");
        teams.add("Cleveland Indians");
        
        System.out.println("New queue LinkedList of teams: \n" + teams + "\n");
        
        /* Declaring the number of elements in the blocking queue below to 5 sets a limit on the number of items and causes the output
           to be false because it exceeds the limit. When adding items to a blocking queue, use the offer() method instead of add()
           because add() will throw an exception error when more items are added than allowed, however offer() will only take the action
           if it is able to */
       Queue<String> teamsList = new ArrayBlockingQueue<>(5);
       teamsList.offer("Rangers");
       teamsList.offer("Yankees");
       teamsList.offer("Astros");
       teamsList.offer("Nationals");
       teamsList.offer("Mariners");
       teamsList.offer("Rays");
       
       // Use peek to get the head of the queue
       System.out.println("Create a second list of teams with a blocking queue:");
       
       // Iterate through the loop
       for (String teamsItem: teamsList) {
        System.out.println(teamsItem);
        }
       
       // Use peek to get the head of the queue
       System.out.println("\nUse peek() to get the head of the ArrayBlockingQueue: " + teamsList.peek());
       
       // Remove items from the queue
       String removeItem;
       removeItem = teamsList.remove();
       System.out.println("\nThe following was removed from the queue: " + teamsList);
       
       // To add elements to the head and tail of the queue, use Dequeue or double ended queue
       Deque<String> teamsList2 = new ArrayDeque<>(teamsList);
       teamsList2.addFirst("Tigers");
       teamsList2.addLast("Indians");
       System.out.println("\nTigers and Indians are added to the first and last of the list: \n\t" + teamsList2);
       
       // Second queue
       Queue<String> positions = new ArrayBlockingQueue<>(9);
       
       positions.offer("pitcher");
       positions.offer("catcher");
       positions.offer("shortstop");
       positions.offer("third base");
       positions.offer("first base");
       positions.offer("second base");
       positions.offer("center field");
       positions.offer("left field");
       positions.offer("right field");
       positions.offer("designated hitter");
       
       if(positions.offer("designated hitter") == false) {
           System.out.println("\nDesignated hitter isn't added because it exceeds the capacity of the queue.\n"
                   + "There is no exception thrown because the safe offer() method is used to add items instead of add().\n");
       }
       for(String lines: positions) {
           System.out.println("Team position: " + lines);
       }
       // Poll is another way to remove items
       System.out.println("\nPolled items: " + positions.poll());
    }
    
}
