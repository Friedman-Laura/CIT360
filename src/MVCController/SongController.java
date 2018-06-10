/**
 *
 * @author Laura - sandbox code
 */
package MVCController;

/* Notice this Controller imports the Model and View.
   The Controller manages the interactions between the Model and View.
   The Controller is the "mediator" between Model and View.
   Model and View will NOT have imports for the other.
*/
import MVCModel.SongModel;
import MVCView.SongView;

public class SongController {
   private final SongModel model;
   private final SongView view;

   public SongController(SongModel model, SongView view){
      this.model = model;
      this.view = view;
   }

   public void setSongtName(String song){
      model.setSong(song);		
   }

   public String getSongtName(){
      return model.getSong();		
   }

   public void setArtistName(String artist){
      model.setArtist(artist);		
   }

   public String getArtistName(){
      return model.getArtist();		
   }

   public void setGenreName(String genre){
      model.setGenre(genre);		
   }

   public String getGenreName(){
      return model.getGenre();		
   }

   public void updateView(){				
      view.printSongDetails(model.getSong(), model.getArtist(), model.getGenre());
   }	
}