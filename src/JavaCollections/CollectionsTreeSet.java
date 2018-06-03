package JavaCollections;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Laura - sandbox code
 */

class Song implements Comparable<Song> {

    int id;
    
    String title, artist, genre;
    
    int sold, left;
    
public Song(int id, String title, String artist, String genre, int sold, int left) {
    this.id = id;
    this.title = title;
    this.artist = artist;
    this.genre = genre;
    this.sold = sold;
    this.left = left;
}
    @Override
    public int compareTo(Song s) {
    if(id > s.id){
        return 1;
    } else if(id < s.id) {
        return -1;
    } else {
        return 0;
    }
}
}

public class CollectionsTreeSet {
    
    public static void main(String args[]) {
    
        // Create a blank Song TreeSet
        Set<Song> set = new TreeSet<>();
        
        int recordNum = 1001;
        
        // Create songs with a dynamically incremented id number
        Song s1 = new Song(recordNum, "Born to Run", "Bruce Springsteen", "Classic Rock", 5, 3);
        Song s2 = new Song(++recordNum, "We Own It", "2 Chainz and Wiz Khalifa", "Rap", 2, 5);
        Song s3 = new Song(++recordNum, "Danza Kuduro", "Don Omar", "Reggaeton", 10, 8);
        Song s4 = new Song(++recordNum, "Morocco", "Rippingtons", "Jazz", 7, 9);
        Song s5 = new Song(++recordNum, "Si No Vuelves", "Gente De Zona", "Salsa", 2, 15);
        
        // Add songs to TreeSet
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        
        // Iterate through the TreeSet and display each record
        for(Song s:set) {
            System.out.println("ID: " + s.id + "\nTitle: " + s.title + "\nArtist: " + s.artist + "\nGenre: " + s.genre + "\nSold: "
                               + s.sold + "\nLeft: " + s.left + "\n");
        }
    }
}