package OOPS;

public class outerClass {
int x =100;

public class innerclass 
{
	int y =200;
	
}

	public static void main(String[] args) {
	outerClass O = new outerClass();
	outerClass.innerclass I = O.new innerclass();
	System.out.println(O.x+","+I.y);
	

	}

}
