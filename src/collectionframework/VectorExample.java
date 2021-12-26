package collectionframework;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<String> vec= new Vector<String>();
		
		// adding elements using add() method of list
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Cat");
		// Adding elements using addElement() method of vector
		vec.addElement("Rat");
		vec.addElement("Deer");
		
		System.out.println("Elements are:"+vec);
		
	}
}
