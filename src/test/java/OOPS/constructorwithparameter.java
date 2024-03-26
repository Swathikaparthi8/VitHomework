package OOPS;

public class constructorwithparameter {
int year;
String month;

public constructorwithparameter(int yy, String mm)
{
	year = yy;
	month = mm;
}
	public static void main(String[] args) {
		constructorwithparameter obj = new constructorwithparameter(2024,"Jan");
		System.out.println(obj.year+" "+obj.month);

	}

}
