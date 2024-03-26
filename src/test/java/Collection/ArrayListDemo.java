package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List a = new ArrayList();
		System.out.println("Empty Arraylist" + a);

		int cnt = a.size();
		System.out.println("size:" + cnt);
		System.out.println(" "); // Just for spacing
		// to insert elements into the list we use 'add' method
		a.add("AAA");
		a.add(25);
		a.add('H');
		a.add("BBB");
		a.add(null);
		System.out.println(a);
		int cnt1 = a.size();
		System.out.println("size:" + cnt1);
		System.out.println(a.contains("Africa")); // contains
		System.out.println(" "); // Just for spacing
		
		a.add(1, "sss");
		System.out.println(a);
		int cnt2 = a.size();
		System.out.println("size:" + cnt2);
		System.out.println(" "); // Just for spacing
	
		a.remove(2);
		System.out.println(a);
		int cnt3 = a.size();
		System.out.println("size:" + cnt3);
		System.out.println(" "); // Just for spacing
		
		// forloop --- one after the other==============
		for (int i = 0; i < a.size(); i++) {
			Object x = a.get(i);
			System.out.println(x);
		}

//	//enhanced forloop
//	for(Object e :a) {
//		System.out.println(e);
//		}
//	Iterator i = a.iterator();
//	while(i.hasNext()) 
//	{
//		System.out.println(i.next());
//		
//}

	}

}
