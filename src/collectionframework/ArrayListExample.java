package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		List<String> ar = new ArrayList<String>();
		
		ar.add("Rajkumar");
		ar.add("Jeet");
		ar.add("Sopan");
		ar.add("Yaseen");
		ar.add("Mahesh");
		ar.add("Ravi");
		ar.add(null);
		//ar.add(11);
		
		// First way
		Iterator<String> it = ar.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			
			//second way
		for(String abc:ar)
		{
			System.out.println(abc);
		}
		
		// third way
		
		System.out.println("Traversing list through for loop");
		for (int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
	}
		
	}
}
