package ExceptionHandling;

public class UnchekedExceptionExample {

	public static void main(String[] args) {
		
		int i=1;
		int j=15;
		int result=0;
		String str=null;
		
		try {
			result=j/i;
			str.length();
			System.out.println("The result is:" + result);
		}
		catch(ArithmeticException e) {
			System.out.println("The error we are facing is:"+e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("There is a null value");
		}
		catch(Exception e){
			System.out.println("Something went wrong.");
		}
		finally {
			System.out.println("This will be executed always");
		}
		
		System.out.println("Program is over");

	}

}
