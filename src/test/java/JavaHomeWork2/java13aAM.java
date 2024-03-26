package JavaHomeWork2;

public class java13aAM {

	public static void main(String[] args) {
		
		java13a s1 = new java13a();
s1.add();
s1.sub();
//s1.div(); private method cant be called in another class
s1.mul();

System.out.println(s1.n1);
System.out.println(s1.n2);
//System.out.println(s1.n3); --- not able to call the variable n3 as it is a protected variable
	}
}

