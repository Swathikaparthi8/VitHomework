package JavaHomeWork2;

public class java14P {
	protected String cars = "Hyundai";
	private String boats = "aaa";
	
	public void Drive()
	{
		System.out.println("Sahasra drives!");
	}
	
	private void Sail()
	{ 
		System.out.println("Popoye sails");
	}
	
	public static void main(String[] args) {
		java14P Parentobj = new java14P();
		Parentobj.Drive();
		Parentobj.Sail();
		
		System.out.println("Car Brand: "+Parentobj.cars);  
		System.out.println("Boats Brand: "+Parentobj.boats);
	}

}
