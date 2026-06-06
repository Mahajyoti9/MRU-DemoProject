package ExceptionHandling;

public class throwExceptionExample {

	public static void deposit(int amount) {
		if (amount<0) {
			throw new IllegalArgumentException();
		}
		else {
			System.out.println("We are inside deposit");
		}
	}
	public static void main(String[] args) {
		try {
			deposit(-20);
			System.out.println("Amout is deposited");
		}
		catch(IllegalArgumentException e) {
			System.out.println("The problem is:" + e.getMessage());
		}

	}

}
