package OOPsConcept;

public class Dog extends Pet implements Animal {
	
	Dog(String n)
	{
		super(n);//This is calling parent constructor
	}
	
	@Override
	void makeASound() {
		System.out.println(name + " barks");
	}
	
	@Override
	public void play() {
		System.out.println(name + " likes to play with bones");
		
	}
}
