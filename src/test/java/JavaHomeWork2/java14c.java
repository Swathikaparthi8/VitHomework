package JavaHomeWork2;

public class java14c extends java14P {
private String Model = "Tuscan";

	public static void main(String[] args) {
		java14c childobj = new java14c();
		childobj.Drive(); // calling the method drive from java14P --- parent class
		//childobj.Sail(); // not able to call since it is a private method
		System.out.println("Car Brand: "+childobj.cars);  // calling the variable drive from java14P --- parent class
		System.out.println("Car Brand: "+childobj.Model);
		//System.out.println("Boats Brand: "+Parentobj.boats); // not able to call since it is a private variable
	}
	}

