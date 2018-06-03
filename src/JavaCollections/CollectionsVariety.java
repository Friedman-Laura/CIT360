package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Laura - sandbox code
 */
public class CollectionsVariety {
    public static void main(String[] args) {
        // Create a list of baseball teams
        List<String> teams = new ArrayList<String>();
        
        // Add elements to the list
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
        
        //Display the list of teams
        System.out.println("***************************************");
        System.out.println("* Original List of Baseball Teams:    *");
        System.out.println("***************************************");
        System.out.println("\t" + teams + "\n");
        
        // Remove an element from the list of teams at a specific index 
        teams.remove(5);
        System.out.println("***************************************");
        System.out.println("* Modified List of Baseball Teams:    *");
        System.out.println("* (without Detroit Tigers)            *");
        System.out.println("***************************************");
        System.out.println("\t" + teams + "\n");

        // Verify that Detroit Tigers was removed from the list
        if(teams.remove("Detroit Tigers")) {
            System.out.println("Removed Detroit Tigers from the List" + "\n");
        } else {
            System.out.println("Detroit Tigers was already removed from the List" + "\n");
        }
        
        // Add an element at a specific index
        teams.add(8, "Toronto Blue Jays");
        System.out.println("***************************************");
        System.out.println("* Modified List of Baseball Teams:    *");
        System.out.println("* (with Toronto Blue Jays added)      *");
        System.out.println("***************************************");
        System.out.println("\t" + teams + "\n");

        // Change elements at specific indices by removing the city/state
        teams.set(0, "Rangers");
        teams.set(1, "Yankees");
        teams.set(2, "Red Sox");
        teams.set(3, "Nationals");
        teams.set(4, "Astros");
        teams.set(5, "Tigers");
        teams.set(6, "White Sox");
        teams.set(7, "Athltics");
        teams.set(8, "Mariners");
        teams.set(9, "Rays");
        teams.set(10, "Angels");
        teams.set(11, "Indians");
        System.out.println("***************************************");
        System.out.println("* Modified List of Baseball Teams:    *");
        System.out.println("* (without City/State names)          *");
        System.out.println("***************************************");
        System.out.println("\t" + teams + "\n");

        System.out.println("***************************************");
        System.out.println("* List the Teams one per line:        *");
        System.out.println("***************************************");
        // Iterate through the list using Java8's forEach() method
        teams.forEach(t->System.out.println(t));
        
        // Sort the list
        Collections.sort(teams);
        System.out.println("***************************************");
        System.out.println("* Sorted List of Teams       :        *");
        System.out.println("***************************************");
        System.out.println(teams  + "\n");
        
        System.out.println("***************************************");
        System.out.println("* Check a Specific Team in the list:  *");
        System.out.println("***************************************");
        // Search for elements in a list
        if(teams.contains("Rangers")) {
            System.out.println("Rangers is on the list.\n");
        } else {
            System.out.println("Rangers is not on the list.\n");
        }
        
        System.out.println("***************************************");
        System.out.println("* Check a Team NOT in the list:       *");
        System.out.println("***************************************");
        // Search for elements not in a list
        if(teams.contains("Mets")) {
            System.out.println("Mets is on the list.\n");
        } else {
            System.out.println("Mets is NOT on the list.\n");
        }
        
        System.out.println("***************************************");
        System.out.println("* Search for the index of an item:    *");
        System.out.println("***************************************");
        // find an element based on index
        int index1 = teams.indexOf("Tigers");
        int index2 = teams.indexOf("Marlins");
        System.out.println("Tigers is found,"
                + " so index1 is true and returns a positive value: " + index1  + "\n");
        System.out.println("Marlins is NOT found,"
                + " so index2 is false and returns a negative value: " + index2  + "\n");

        // Check the size of the first list
        System.out.println("***************************************");
        System.out.println("* Size of the First List (teams):  *");
        System.out.println("***************************************");
        System.out.println(teams.size() + "\n");

        // Use the Collections.shuffle() method to shuffle the list of teams
        Collections.shuffle(teams);
        System.out.println("***************************************");
        System.out.println("* List of Teams after being shuffled: *");
        System.out.println("***************************************");
        System.out.println(teams + "\n");
        
        // A list can also be reversed
        Collections.reverse(teams);
        System.out.println("***************************************");
        System.out.println("* List of Teams in reverse order:     *");
        System.out.println("***************************************");
        System.out.println(teams + "\n");
    }
    
}
