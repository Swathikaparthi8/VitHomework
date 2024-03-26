package OOPS;

public class constructorDemo {
int age;
String name;


//creating a constructor to initialize values for the variables
public constructorDemo()
{
	age = 16;
	name = "aaa";
	
}
	public static void main(String[] args) {
		constructorDemo obj = new constructorDemo();
		System.out.println(obj.age+" "+obj.name);

	}

}
