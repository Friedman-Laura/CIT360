package HttpUrlConnect;
 
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
 
/**
 * @author Laura - sandbox code
 * 
 */
/*
    A simple program to check the status of a URL. It returns "green" if up and "red" if unreachable.
    I set several URLs to https to demonstrate failed attempts to reach a URL.
*/
public class CheckURLStatus {
    public static void main(String args[]) throws Exception {
 
        String[] hostList = { "http://www.redonks.com", "http://www.mightygeeks.net",
                "http://www.laurafriedman.com", "http://www.heartlaf.com",
                "http://www.anzianofriedman.com", "http://www.powercoaching.com",
                "https://www.powercoaching.com", "https://www.laurafriedman.com",
                "http://www.kairoswomen.com/", "http://www.amazingwp.com/",
                "http://www.fundazing.com/", "http://www.trooluv.com/"};
 
        for (int i = 0; i < hostList.length; i++) {
 
            String url = hostList[i];
            String status = getURLStatus(url);
 
            System.out.println(url + "\t\tStatus:" + status);
        }
 
    }
 
    public static String getURLStatus(String url) throws IOException {
 
        String result = "";
        try {
            // Create a new HttpURL object
            URL siteURL = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) siteURL
                    .openConnection();
            
            // Initialize the method to GET or retrieve information from the URL
            connection.setRequestMethod("GET");
            
            // Initialize the connection to the URL
            connection.connect();
 
            // Check the response code to see if it successfully connected to the URL
            int code = connection.getResponseCode();
            
            // A return code of 200 means the URL was successfully reached
            if (code == 200) {
                result = "Green";
            }
            
            // Terminate the HTTP URL connection and release its resources
            connection.disconnect();
        } catch (Exception e) {
            result = "->Red<-";
        }
        return result;
    }
 
}