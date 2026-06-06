package CollectionFramework;

import java.util.HashSet;

public class HashSetExa {

	public static void main(String[] args) {
		
		HashSet<Integer> marks= new HashSet<Integer>();
		
		marks.add(45);
		marks.add(34);
		marks.add(57);
		
		System.out.println(marks);
		System.out.println(marks.contains(10));
		marks.remove(34);
		System.out.println(marks);
		System.out.println(marks.size());

	}

}
