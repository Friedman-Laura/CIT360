package HttpUrlConnect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/*
 * @author Laura - sandbox code
 */

/*
    This is a simple program to read from a URL.
    It does not manage HTTP requests or check for a valid connection.
    It also does not ensure a clean connect() / disconnect() method.
*/
public class ReadWebPage {

    public static void main(String[] args) {
        try {
            // Read from a website I created for BYU-Idaho courses
            URL url = new URL("https://www.redonks.com");
            
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            
            // Read each line as long as line is not null and display it on the screen
            String line = "";
            while (line != null) {
                line = inputStream.readLine();
                System.out.println(line);
            }
            inputStream.close(); // close the stream
            
            // Use an exception in case there's an error
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
    
}
