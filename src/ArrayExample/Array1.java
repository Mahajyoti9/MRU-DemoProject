package ArrayExample;

public class Array1 {

	public static void main(String[] args) {
		int[] marks= {10,20,52,35,43};	//creating an array
		System.out.println("The length of the array is:" + marks.length);
		/*for (int i=0;i<=marks.length-1;i++) {
			System.out.print(marks[i] + " ");
		}*/
		for(int mark:marks) {
			System.out.print(mark + " ");
		}
	}

}
