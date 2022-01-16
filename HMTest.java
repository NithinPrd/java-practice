import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HMTest {
    public static void main(String args[]) throws IOException {
        HashMap<String, HashMap<String, String>> map = new HashMap<>();
        HashMap<String, String> valueMap = null;
        String line;
        String orderItem, quantity, itemTax;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while((line = br.readLine())!=null) {
            orderItem = "10110";
            quantity = "23";
            itemTax = "24.07";
            if(map.containsKey(orderItem)) {
                valueMap = map.get(orderItem);
                valueMap.put("quantity", String.valueOf(Integer.parseInt(valueMap.get("quantity"))+Integer.parseInt(quantity)));
                valueMap.put("itemTax", String.valueOf(Integer.parseInt(valueMap.get("itemTax"))+Integer.parseInt(itemTax)));
                map.put(orderItem, valueMap);
            } else {
                valueMap = new HashMap<>();
                valueMap.put("quantity", quantity);
                valueMap.put("itemTax", itemTax);
                valueMap.put("otherKey", "anyOtherValue");
                map.put(orderItem, valueMap);
            }
        }
        for(String orderItems: map.keySet()) {
            valueMap = map.get(orderItems);
            //Aggregate data here
            valueMap.get("quantity");
        }
    } 
}
