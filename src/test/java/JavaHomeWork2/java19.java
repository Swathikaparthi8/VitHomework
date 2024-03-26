package JavaHomeWork2;

public class java19 
{
	static void checkAge(int age) 
 {
		if (age < 18)
	{
		 throw new ArithmeticException("Access denied.");
	} 
		else
	{
			System.out.println("Access granted!");
	}
 }

	public static void main(String[] args) {
		checkAge(20);
		checkAge(15); // throws error
	}
}
