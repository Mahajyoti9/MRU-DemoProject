package ExceptionHandling;

 import ExceptionHandling.AgeException;
 
public class CustomExcEx {
	public static void vote(int age) {
		if(age<18) {
			throw new AgeException("cannot vote");
		}
		System.out.println("voted");
	}
	public static void main(String[] args) {
		
		try {
		vote(19);
		}
		catch(AgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
