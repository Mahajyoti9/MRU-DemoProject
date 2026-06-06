package OOPsConcept;

public class cat extends Pet implements Animal{
	cat(String n)
	{
		super(n);
	}
	
	@Override
	void makeASound() {
		System.out.println(name + " meow");
	}
	
	@Override
	public void play() {
		System.out.println(name + " likes to play with ball");		
	}
}
