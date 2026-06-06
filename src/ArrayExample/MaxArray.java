package ArrayExample;

public class MaxArray {
		public static void main(String[] args) {
			int[] marks= {10,20,52,35,43};	//creating an array
			int max=0;
			for(int mark:marks) {
				if(mark>max) {
					max=mark;
				}
			}
			System.out.print("The max value in the array is:" + max);
		}

	}