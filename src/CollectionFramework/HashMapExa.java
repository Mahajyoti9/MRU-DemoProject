package CollectionFramework;

import java.util.HashMap;

public class HashMapExa {

	public static void main(String[] args) {
		
		HashMap<Integer, String> student= new HashMap<Integer, String>();
		
		student.put(1, "Anita");
		student.put(2, "Sunita");
		student.put(3, "Akash");
		
		System.out.println(student);
		System.out.println(student.containsKey(4));
		System.out.println(student.containsValue("Akash"));
		System.out.println(student.get(2l>));
		
	}

}
