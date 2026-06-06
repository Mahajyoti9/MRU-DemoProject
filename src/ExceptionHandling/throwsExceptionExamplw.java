package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class throwsExceptionExamplw {
	
	public static void FileRead() throws IOException{
		FileReader fr=new FileReader("somefile.txt");
		System.out.println("Test");
	}
	public static void main(String[] args) {
		
		try {
			FileRead();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
