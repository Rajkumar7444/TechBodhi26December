package collectionframework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		
	// Creating LinkedHasSet and adding elements
		
		TreeSet<String> abc=new TreeSet();
		abc.add("One");
		abc.add("Two");
		abc.add("Three");
		abc.add("Four");
		abc.add("Five");
		abc.add("One");
		//abc.add(null);
		//abc.add(null);   // null can not allowed in tree set
		
		Iterator<String> x=abc.iterator();
		
		while(x.hasNext())
		{
			System.out.println(x.next());
		}
	}

}
