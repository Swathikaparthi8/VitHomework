package OOPS;

public class encapsulation1 {
public String username;
private String password; // encapsuled---password is private


//Getter method to get password--- just gets the private password --- it always is a return type method
public String getPassword()
{
	return password;
	
}

//Setter method ---assigns a value to the private variable ---it is always void and no return value
public void setPassword(String password) //Parameter
{
 this.password = password; //use this for current password (look at the colors)
}

	public static void main(String[] args) {
		encapsulation1 obj = new encapsulation1();
	
		System.out.println(obj.username+","+obj.password); //// prints null,null as no values are assigned to the string variables
	}

}
