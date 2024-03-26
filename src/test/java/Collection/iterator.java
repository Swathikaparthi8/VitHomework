package Collection;

import java.util.ArrayList;
import java.util.Iterator;


///use while condition for iteration
public class iterator {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList <String>();
		
		cars.add("BMW");
		cars.add(0, "Benz");
		cars.add("Tesla");
		cars.contains("Audi");
		cars.addAll(cars);
	
		System.out.println(cars);
		
		//For loop
		for (int i =0; i<cars.size(); i++)
		{
			System.out.println(cars.get(i));
		}
		 
		System.out.println(" ");
	//Iterator --- prints just the first element
		Iterator<String> it = cars.iterator();
		System.out.println(it.next());
		
		System.out.println(" ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
