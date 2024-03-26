package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapCountries {

	public static void main(String[] args) {
	Map<String, String> obj = new HashMap<String, String>();
	
	obj.put("India", "Hyderabad");
	obj.put("USA", "Seattle");
	obj.put("Canada","Otawa");
	obj.put("China", "Beijing");
	obj.put("Mexico", "Mexico");
	
	System.out.println(obj.containsKey("India"));
	System.out.println(obj.containsKey("Africa"));

	System.out.println(" "); //Just for spacing
	System.out.println(obj.size());
	// To print keys and values
	for (String i: obj.keySet())
	System.out.println(i+", "+obj.get(i));
	
	System.out.println(" "); //Just for spacing
	
	//To print only values
	for (String v: obj.values())
	System.out.println(v);
	
	System.out.println(" "); //Just for spacing
	
	obj.remove("China", "Beijing");
	System.out.println(obj.size());
	for (String i: obj.keySet())
		System.out.println(i+", "+obj.get(i));
	}

}
