package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetExample {
	public static void main(String[] args) {
		
		// Creating HasSet and adding elements
		
		HashSet<String> abc=new HashSet();
		abc.add("One");
		abc.add("Two");
		abc.add("Three");
		abc.add("Four");
		abc.add("Five");
		abc.add("One");
		abc.add(null);
		abc.add(null);
		
		Iterator<String> x=abc.iterator();
		
		while(x.hasNext())
		{
			System.out.println(x.next());
		}
	}

}
