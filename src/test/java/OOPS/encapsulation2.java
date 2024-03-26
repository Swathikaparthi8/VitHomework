package OOPS;

public class encapsulation2 {

	public static void main(String[] args) {
		encapsulation1 obj1 = new encapsulation1(); // calling the class it here to use methods and variables in it
		String unm = obj1.username = "AAA"; // Assigning value to username
System.out.println(unm);

		String pswd = obj1.getPassword();
System.out.println(pswd);// no value assigned yet-- prints null

		obj1.setPassword("ABABAB"); // setPassword method already has a string parameter so no need to again assign it to a variable String
		String pswd1= obj1.getPassword(); // returns password assigned for the private variable
System.out.println(pswd1);
	}

}
