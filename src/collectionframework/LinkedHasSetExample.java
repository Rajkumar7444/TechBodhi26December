package collectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHasSetExample {
	
	public static void main(String[] args) {
		
	// Creating LinkedHasSet and adding elements
		
		LinkedHashSet<String> abc=new LinkedHashSet();
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
