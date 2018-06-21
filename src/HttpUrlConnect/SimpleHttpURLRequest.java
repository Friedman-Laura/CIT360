package HttpUrlConnect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/*
 * @author Laura - sandbox code
 */

/*
    This is a simple program that opens a Http URL connection, reads the contents
    of a webpage, parses the data read and displays it, then disconnects from the
    HTTP URL.
    It manage HTTP GET requests and checks for a valid connection.
    It also ensures a clean connect() / disconnect() method.
*/
public class SimpleHttpURLRequest {

    public static void main(String[] args) {
        // Create and initialize all variables here so they can be reinitialized at the end
        HttpURLConnection urlConnObj = null;
        BufferedReader rd  = null;  
        StringBuilder sb = null;      
        OutputStreamWriter wr = null;
        String line = null;
        
        try {
            URL serverAddress = new URL("http://www.redonks.com");
          
            // Set up the initial connection
            urlConnObj = (HttpURLConnection) serverAddress.openConnection();
          
            // Set the method to retrieve information from the URL
            urlConnObj.setRequestMethod("GET");
          
            urlConnObj.setDoOutput(true);
          
            // Set timeout in case the read operation takes too long
            urlConnObj.setReadTimeout(10000);
                    
            // Connect to the HTTP URL
            urlConnObj.connect();
        
            //read the result from the server
            rd  = new BufferedReader(new InputStreamReader(urlConnObj.getInputStream()));
            sb = new StringBuilder();
        
            while ((line = rd.readLine()) != null)
            {
                sb.append(line + '\n');
            }
        
            System.out.println(sb.toString());
                    
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally
        {
            //close the connection, set all objects to null
            urlConnObj.disconnect();
            rd = null;
            sb = null;
            wr = null;
            urlConnObj = null;
        }
    }
}
