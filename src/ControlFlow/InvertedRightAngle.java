package ControlFlow;

import java.util.Scanner;

public class InvertedRightAngle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=i-1;k++) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
