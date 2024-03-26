package JavaHomeWork2;

public class java11 
{
	String cars[] = { "Volvo", "BMW", "Ford", "Mazda" }; // Array is always in {}

	public void CarNames()
	{
		System.out.println("3rd item in the array: " + cars[2]);
	}

	public static void main(String[] args) 
	{

		java11 obj = new java11();
		obj.CarNames();
	}
}
