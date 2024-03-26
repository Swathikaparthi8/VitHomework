package InterfaceDemo;

public class Inheritanceinterface implements A,B {

	public static void main(String[] args) {
		Inheritanceinterface X = new Inheritanceinterface();
X.add();
X.sub();
	}

	@Override
	public void add() {
		System.out.println("add");
		
	}

	@Override
	public void sub() {
	System.out.println("sub");
		
	}

}
