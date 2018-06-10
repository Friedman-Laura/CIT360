package JSONTopic;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

/**
 *
 * @author Laura - sandbox code
 */

/*
    This is a simple program to parse objects in a JSON file and display them.
*/
public class ParseJSONFile {

    public static void main(String[] args) throws Exception {
        // parsing file "JSONExample.json"
        Object obj = new JSONParser().parse(new FileReader("C:\\Users\\Laura\\Dropbox\\College\\BYU Idaho\\2018-04-Spring\\CIT360-ObjOrientedProg2\\CIT360\\src\\QCJSONandJSON\\ParseFile.json"));

        // typecasting obj to JSONObject
        JSONObject jObject = (JSONObject) obj;

        // getting firstName and lastName
        String fName = (String) jObject.get("fName");
        String lName = (String) jObject.get("lName");

        System.out.println("First Name: " + fName);
        System.out.println("Last Name: " + lName);

        // getting age
        long age = (long) jObject.get("age");
        System.out.println("Age: " + age);

        // getting address
        Map address = ((Map) jObject.get("address"));
        System.out.println("Address: ");

        // iterating address Map
        Iterator<Map.Entry> itr1 = address.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            System.out.println("\t" + pair.getKey() + " : " + pair.getValue());
        }

        // getting phoneNumbers
        JSONArray jArray = (JSONArray) jObject.get("phoneNumbers");
        System.out.println("Phone Numbers: ");

        // iterating phoneNumbers
        Iterator itr2 = jArray.iterator();

        while (itr2.hasNext()) {
            itr1 = ((Map) itr2.next()).entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println("\t" + pair.getKey() + " : " + pair.getValue());
            }
        }
    }
}
