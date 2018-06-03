package JavaCollections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Laura - sandbox code
 */

class Students{
    private int age;
    private String name;
    
    public Students(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student age is: " + age + "; Student is " + name;
    }
// Add hashCode and equals as Comparators if you think there are duplicates
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.age;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Students other = (Students) obj;
        if (this.age != other.age) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
    
}

public class CollectionsMap {
    public static void main(String[] args) {
        /* HashMap DOES NOT retain the order a map was written
           LinkedHashMap or TreeMap DOES retain the order a map was written
        */
        Students student1 = new Students(55, "Laura");
        Students student2 = new Students(26, "Samantha");
        Students student3 = new Students(23, "Michael");
        Students student4 = new Students(21, "McKenna");
        Students student5 = new Students(45, "Holly");
        Students student6 = new Students(38, "Richard");
        Students student7 = new Students(39, "Danyal");
        
        System.out.println("Create LinkedHashSet using the Map method and add the students:");
        Map<Students, Integer> map = new LinkedHashMap<>();
        // Use put to add to the map
        map.put(student1, 1);
        map.put(student2, 2);
        map.put(student3, 3);
        map.put(student4, 4);
        map.put(student5, 5);
        map.put(student6 ,6);
        map.put(student7 ,7);
        
        // Map keys are unique and will not include duplicate items        
        map.put(student5, 5);
        
        // iterate through the map
        for(Students key: map.keySet()) { 
            System.out.println("\tKey " + map.get(key) + " - " + key);
        }
        
        System.out.println("\nCreate a second LinkedHashSet using the Set method and add the students:");

        Set<Students> studentset = new LinkedHashSet<>();
 
        // Add items to the set
        studentset.add(student1);
        studentset.add(student2);
        studentset.add(student3);
        studentset.add(student4);
        studentset.add(student5);
        studentset.add(student6);
        System.out.println("\t" + studentset);
    } 
}
