package JavaHomeWork2;

//Multiply nums using a return type method
public class java12a
{
	int a = 10;
	int b = 20;
	int res = a * b;

	public int Multiply() 
	{
		System.out.println("Product: " + res);
		return res;
	}

	public static void main(String[] args)
	{
		java12a obj = new java12a();
		obj.Multiply();
	}
}
