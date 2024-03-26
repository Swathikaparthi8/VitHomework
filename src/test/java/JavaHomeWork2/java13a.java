package JavaHomeWork2;
//Access Modifiers
public class java13a {
int n1 = 200;
protected int n2 = 100;
private int n3 = 10;

	void add (){ //default method not public not private..ext
		int sum = n1 + n2 +n3;
		System.out.println("n1+n2+n3 = " +sum);
	}
	
	public void sub(){
		int diff = n1-n2-n3;
		System.out.println("n1-n2 = " +diff);
	}
	
	private void div() {
		int quotioent = n1/n2;
		int reminder = n1%n2;
		System.out.println("n1/n2 = " +quotioent);
		System.out.println("n2%n1 = " +reminder);
	}
	
	protected void mul() {
		int product = n1*n2*n3;
		System.out.println("n1*n2*n3 = " +product);
	}
	
	public static void main(String[] args) {
		
         java13a s = new java13a();
s.add();
s.sub();
s.div();
s.mul();
int p = s.n2;

System.out.println(p);

	}

}
