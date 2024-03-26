package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDEMO 
{
	public static void main(String[] args) {
		Map<String, Integer> obj = new HashMap<String, Integer>();
		
//inserting elements into HashMap -- Keys and Values--Using 'put' method
	// Keys -- No Duplicates, Values can have Duplicates
		obj.put("A", 1);
		obj.put("B", 2);
		obj.put("C", 1);
		obj.put("D", 2);
		obj.put("E", 1);
		obj.put("F", 2);
		obj.put("G", 1);
		obj.put("H", 2);
	//	obj.put(null, null);
	//	obj.put(null, null); // throws an error as HashMap accepts only 1 null 
	
// to get all keys using a for loop(KeySet)
for (String k: obj.keySet())
	System.out.println(k);

System.out.println("================="); //Just for spacing

//to get all values using a for loop(KeySet)
for (int v: obj.values())
	System.out.println(v);
System.out.println("================="); //Just for spacing

// to get all keys and values using a for loop(KeySEt)
for (String i: obj.keySet())
System.out.println(i+","+obj.get(i));
	}
}
