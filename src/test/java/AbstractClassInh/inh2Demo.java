package AbstractClassInh;

public class inh2Demo extends inh1Demo {
	int graduationYear = 2026;
	
public void Study()
{
	System.out.println("Study all day");
	
}

	public static void main(String[] args) {
	inh2Demo obj = new inh2Demo();
	obj.Study();
	System.out.println(obj.name);
	System.out.println(obj.age);
	System.out.println(obj.graduationYear);

	}

}
