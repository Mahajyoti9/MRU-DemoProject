package ExceptionHandling;

import java.io.FileReader;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		
		try {
		FileReader fr=new FileReader("Filenotthere.txt");
		System.out.println("The file is read");
		}
		catch(Exception e) {
			System.out.println("Something is not correct " + e.getMessage());
		}
	}

}
