/**
 *
 * @author Laura - sandbox code
 */

/* Notice this Model DOES NOT import the Controller and/or View.
   Model ONLY talks to View THROUGH Controller.
*/
package MVCModel;

public class SongModel {
   private String songName;
   private String artistName;
   private String genreName;
   
   public String getSong() {
      return songName;
   }
   
   public void setSong(String songName) {
      this.songName = songName;
   }

   public String getArtist() {
      return artistName;
   }
   
   public void setArtist(String artistName) {
      this.artistName = artistName;
   }
   
   public String getGenre() {
      return genreName;
   }
   
   public void setGenre(String genreName) {
      this.genreName = genreName;
   }
}