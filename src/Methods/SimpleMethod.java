package Methods;

public class SimpleMethod {
	//defining the method or body of the method
	static int add(int a,int b) {//add method is having two parameters
		int c=a+b;
		return c;
	}

	public static void main(String[] args) {
		//int result=add(5,7);//calling the method, invoking the method
		// both 5,7 are argument of add method
		System.out.println("The result is:" + add(5,7));
	}

}
