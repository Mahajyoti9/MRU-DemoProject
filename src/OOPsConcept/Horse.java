package OOPsConcept;

public class Horse extends Pet {
	Horse(String n)
	{
		super(n);
	}
	
	@Override
	void makeASound() {
		System.out.println(name + " neigh");
	}
}
