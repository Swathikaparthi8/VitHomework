package OOPS;


///OVERRIDING PARENT AND CHILD HAVE SAME METHODS 
  class polyAnimals
{
	public void AnimalSound()
	{
		System.out.println("Animals make sound");
	}
}
 class Cows extends polyAnimals
{
	public void AnimalSound() 
	{
		System.out.println("Cows ga MOO");
	}
}

class Dogs extends polyAnimals
{
	public void AnimalSound() 
	{
		System.out.println("Dogs go woof woof");
	}
}

 class polyAnimals3 {
	public static void main(String[] args) 
	{
polyAnimals obj = new polyAnimals();
polyAnimals obj1 = new Cows();
polyAnimals obj2 = new Dogs();

obj.AnimalSound();
obj1.AnimalSound();
obj2.AnimalSound();

	}

}

