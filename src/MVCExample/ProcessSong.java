package MVCExample;

import MVCView.SongView;
import MVCController.SongController;
import MVCModel.SongModel;

/**
 *
 * @author Laura - sandbox code
 */
public class ProcessSong {
  
   public static void main(String[] args) {

      //get a song record from the database (which is manually returned for this example)
      SongModel model = getSongFromDB();

      //Create a view : to write song details on the console
      SongView view = new SongView();

      //Createe a controller for the song details that will manage the model and view
      SongController controller = new SongController(model, view);

      // Display the first song retrieved
      controller.updateView();

      //change the name of the song
      model.setSong("Born to Run");
      
      //change the artist of the song
      model.setArtist("Bruce Springsteen");

      //change the artist of the song
      model.setGenre("Classic Rock");

      // Display the updated song information
      controller.updateView();
   }

   /* This is manually set for the purpose of this simple example,
    * but would be more complex in a real environment.
    */
   private static SongModel getSongFromDB(){
      SongModel song = new SongModel();
      song.setSong("Mr. Blue Sky");
      song.setArtist("Electric Light Orchestra");
      song.setGenre("Rock");
      return song;
   }
}