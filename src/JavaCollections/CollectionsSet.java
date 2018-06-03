package JavaCollections;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Laura - sandbox code
 */

public class CollectionsSet {
    public static void main(String[] args) {
        
        // The use of HashSet doesn't print the list based on the way it was written
        Set<String> courses = new HashSet<String>();
        
        /* Set<String> names = new HashLinkedSet<>(); - Use this method if you want
          to maintain the order in which you've written the list*/
        
        // Use Set<String> names = new TreeSet<String>(); if you want the Set alphabetized or in numeric order
        
        // Check the newly created courses Set to see if it's empty.
        if(courses.isEmpty()) {
            System.out.println("The Courses Set is empty:");
            System.out.println("\t" + courses + "\n");            
        }
        
        // Add course names to the course list.
        courses.add("Mobile Application Development");
        courses.add("Operating Systems I");
        courses.add("Systems Security I");
        courses.add("Network Design I");
        courses.add("Object Oriented Programming I");
        courses.add("Project Management");
        courses.add("Systems Analysis & Design");
        courses.add("Web Front-End Development");
        courses.add("Database Programming I");
        courses.add("Senior Project");
        
        System.out.println("***********************************************************************************************");
        System.out.println("* Order of courses added to the Set:                                                          *");
        System.out.println("\tMobile Application Development");
        System.out.println("\tOperating Systems I");
        System.out.println("\tSystems Security I");
        System.out.println("\tNetwork Design I");
        System.out.println("\tObject Oriented Programming I");
        System.out.println("\tProject Management");
        System.out.println("\tSystems Analysis & Design");
        System.out.println("\tWeb Front-End Development");
        System.out.println("\tDatabase Programming I");
        System.out.println("\tSenior Project");
        System.out.println("***********************************************************************************************\n");
        
        System.out.println("***********************************************************************************************");
        System.out.println("Display the courses Set I just created:                                                       *");
        System.out.println("***********************************************************************************************");
        System.out.println("\t" + courses + "\n");
        
        System.out.println("***********************************************************************************************");
        System.out.println("* NOTE: HashSet did NOT maintain the order of courses. To maintain the order of the courses   *");
        System.out.println("* in a Set, use HashLinkedSet as follows:  Set<String> names = new HashLinkedSet<>();         *");
        System.out.println("***********************************************************************************************\n");
        
        System.out.println("***********************************************************************************************");
        System.out.println("* To automatically sort a Set numerically or alphabetically, use TreeSet as follows:          *");
        System.out.println("*     Set<String> names = new TreeSet<String>();                                              *");
        System.out.println("***********************************************************************************************\n");
                      
        System.out.println("***********************************************************************************************");
        System.out.println(" Try to add two courses again: Senior Project & Project Management                            *\n");
        
        // Sets do not accept duplicate items:
        courses.add("Senior Project");
        courses.add("Project Management");
        
        System.out.println("* Senior Project & Project Management were NOT added to the list because Set does NOT allow   *");
        System.out.println("* duplicate items. Here is the UNCHANGED list:                                                *");
        System.out.println("***********************************************************************************************");
        System.out.println("\t" + courses + "\n");
        
        System.out.println("***********************************************************************************************");
        System.out.println(" Try to add a new course: Business Intelligence & Analytics                                   *\n");
        
        // Sets only contain unique items
        courses.add("Business Intelligence & Analytics");
        
        System.out.println("* Business Intelligence & Analytics WAS added to the list of courses because it was not on    *");
        System.out.println("* the previous list. Here is the CHANGED list:                                                *");
        System.out.println("***********************************************************************************************");
        
        // Iterate through the set of course and print one per line
        courses.forEach((element) -> {
            System.out.println("\t" + element);
        });

        System.out.println("\n***********************************************************************************************");
        System.out.println("* Search through a list quickly using the 'contains' method.                                  *");
        System.out.println("* I'm looking for 'Project Management' in the list:                                           *");
        System.out.println("***********************************************************************************************\n");
                      
        if (courses.contains("Project Management")) {
            System.out.println("\n\tProject Management is found in the list.");
        }
        
        // Create a second course list that contains items from the first list
        Set<String> courses1 = new HashSet<>();
        courses1.add("Mobile Application Development");
        courses1.add("Operating Systems I");
        courses1.add("Systems Security I");
        courses1.add("Network Design I");
        courses1.add("Object Oriented Programming I");
        courses1.add("Project Management");
        courses1.add("Systems Analysis & Design");
        
        System.out.println("***********************************************************************************************");
        System.out.println("* Just created a second course list containing some of the courses from the first list:       *");
        System.out.println("\tMobile Application Development");
        System.out.println("\tOperating Systems I");
        System.out.println("\tSystems Security I");
        System.out.println("\tNetwork Design I");
        System.out.println("\tObject Oriented Programming I");
        System.out.println("\tProject Management");
        System.out.println("\tSystems Analysis & Design");
        System.out.println("***********************************************************************************************\n");

        // Create a copy of the original set and display it on the screen
        Set<String> same = new HashSet<>(courses);
        System.out.println("Create a copy of the original set of courses: \n\t" + same +"\n");
        
        // To see what elements intersect between the two sets use the retains method
        same.retainAll(courses1);

        System.out.println("***********************************************************************************************");
        System.out.println("* To see what courses intersect (are the same) between the two sets, use 'retainAll' method.  *");
        System.out.println("***********************************************************************************************\n");
        System.out.println("Courses common to both lists are: \n\t" + same +"\n");
        
        // You can also find the difference between the two by using removeAll()
        Set<String> different = new HashSet<>(courses);
        
        System.out.println("***********************************************************************************************");
        System.out.println("* To see difference between the two sets, use the 'removeAll' method.                         *");
        System.out.println("***********************************************************************************************\n");
        different.removeAll(courses1);
        System.out.println("Courses in the first list that are NOT in the second list are: \n\t" + different);
    }
    
}
