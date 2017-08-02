import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/*
 * @Author : Dhaval Jardosh
 */
public class JsonSimpleReadExample {
 
 public static void main(String[] args) {
 
  JSONParser parser = new JSONParser();
 
  try {
 
   Object obj = parser.parse(new FileReader("/home/dhaval/Desktop/json/example.json"));
 
   JSONObject jsonObject = (JSONObject) obj;
 
   String version = (String) jsonObject.get("version");
   System.out.println("Version: "+version);
 
   String senderID = (String) jsonObject.get("senderID");
   System.out.println("Sender ID: "+senderID);
   
   String notificationType = (String) jsonObject.get("notificationType");
   System.out.println("Notification Type: "+notificationType);
   
   String escalationReason = (String) jsonObject.get("escalationReason");
   System.out.println("Name Of Country: "+escalationReason);
   
   String notes = (String) jsonObject.get("notes");
   System.out.println("Notes : "+notes);
   
   String referenceID = (String) jsonObject.get("referenceID");
   System.out.println("Reference ID: "+referenceID);
   
   String orderNumber = (String) jsonObject.get("orderNumber");
   System.out.println("Order Number : "+orderNumber);
   
   JSONObject replacementProductDetails = (JSONObject) jsonObject.get("replacementProductDetails");
   
   String type = (String) replacementProductDetails.get("type");
   System.out.println("Type : "+type);
   
   String manufacturer = (String) replacementProductDetails.get("manufacturer");
   System.out.println("MFG : "+manufacturer);
   
   String model = (String) replacementProductDetails.get("model");
   System.out.println("Model : "+model);
   
   String condition = (String) replacementProductDetails.get("condition");
   System.out.println("Condition : "+condition);
   
   String price = (String) replacementProductDetails.get("price");
   System.out.println("Price: "+price);
   
   String shippingCarrier = (String) replacementProductDetails.get("shippingCarrier");
   System.out.println("Carrier: "+shippingCarrier);
   
   String trackingNumber = (String) replacementProductDetails.get("trackingNumber");
   System.out.println("Tracking: "+trackingNumber);

 
  } catch (FileNotFoundException e) {
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  } catch (ParseException e) {
   e.printStackTrace();
  }
 
 }
}
 
