/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Laura
 */
public class CollectionsTree {
    public static void main(String args[]) {
    
    // Creating and adding elements
    TreeSet<String> sweets = new TreeSet<>();
    
    sweets.add("candy bars");
    sweets.add("ice cream");
    sweets.add("cookies");
    sweets.add("pies");
    sweets.add("cake");
    sweets.add("chocolate");
    
    // Iterate through TreeSet
    Iterator<String> itr = sweets.iterator();
        while(itr.hasNext()) {
        System.out.println("TreeSet list: " + itr.next());
        }
    }   
    
}
