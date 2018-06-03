package JavaCollections;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Laura - sandbox code
 */

public class CollectionsTree {
    public static void main(String args[]) {
    
    // Creating and adding simple string elements (courses) to a tree
    TreeSet<String> courses = new TreeSet<>();
    
    courses.add("Mobile Application Development");
    courses.add("Operating Systems I");
    courses.add("Systems Security I");
    courses.add("Networking I");
    courses.add("Object Oriented Programming I");
    courses.add("Project Management");
    courses.add("Systems Analysis & Design");
    courses.add("Web Front-End Development");
    courses.add("Database Programming I");
    courses.add("Senior Project");
    
    System.out.println("*****************************************************");
    System.out.println("* This is the original order the courses were added *"
                   + "\n* to the list:                                      *");
    System.out.println("*****************************************************");
    System.out.println("\tMobile Application Development");
    System.out.println("\tOperating Systems I");
    System.out.println("\tSystems Security I");
    System.out.println("\tNetworking I");
    System.out.println("\tObject Oriented Programming I");
    System.out.println("\tProject Management");
    System.out.println("\tSystems Analysis & Design");
    System.out.println("\tWeb Front-End Development");
    System.out.println("\tDatabase Programming I");
    System.out.println("\tSenior Project\n");

    System.out.println("*****************************************************");
    System.out.println("* Notice when iterating through the tree and        *"
                   + "\n* displaying the courses, they are now sorted:      *");
    System.out.println("*****************************************************");
    
    // Iterate through TreeSet
    Iterator<String> itr = courses.iterator();
        while(itr.hasNext()) {
        System.out.println("\t" + itr.next());
        }
    }   
    
}
