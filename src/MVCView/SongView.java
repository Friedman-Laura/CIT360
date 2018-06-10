/**
 *
 * @author Laura - sandbox code
 */

/* Notice this View DOES NOT import the Controller and/or Model.
   View ONLY talks to Model THROUGH Controller.
*/

package MVCView;

public class SongView {
   public void printSongDetails(String songName, String artistName, String genreName){
      System.out.println("Song Information: ");
      System.out.println("Name: " + songName);
      System.out.println("Artist: " + artistName);
      System.out.println("Genre: " + genreName);
   }
}
