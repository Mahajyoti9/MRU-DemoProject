package OOPsConcept;

public class Main {

	public static void main(String[] args) {
		Dog d1=new Dog("Tommy");
		d1.makeASound();//dynamic binding/late binding
		d1.play();
		Pet p2=new cat("blacky");
		p2.makeASound();
		Pet p3=new Horse("Speedy");
		p3.makeASound();
		
	}

}
