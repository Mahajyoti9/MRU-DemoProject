package BasicJavaProgram;

import java.util.Scanner;

public class AreaOfACircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius");
		int radius= sc.nextInt();
		final double pi=3.14;
		double area= pi * radius * radius;
		System.out.println("The area of the circle is:" + area);
		sc.close();
	}

}
