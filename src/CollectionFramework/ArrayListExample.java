package CollectionFramework;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
			
		ArrayList<String> friends=new ArrayList<String>();
		
		friends.add("Anita");
		friends.add("Sunita");
		friends.add("Anil");
		
		System.out.println(friends);
		
		System.out.println(friends.contains("Akash"));
		System.out.println(friends.size());
		System.out.println(friends.get(1));
		System.out.println(friends.set(2, "Ankita"));
		System.out.println(friends);
	}

}
