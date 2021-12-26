package collectionframework;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkListExample {
	public static void main(String[] args) {
		
		List<Integer> abc= new LinkedList<Integer>();
		
		abc.add(12);
		abc.add(15);
		abc.add(10);
		abc.add(22);
		abc.add(17);
		abc.add(9);
		//abc.add(null);
		
		//sorting
		Collections.sort(abc);
		Iterator<Integer> xyz=abc.iterator();
		while(xyz.hasNext()) 
		{
			System.out.println(xyz.next());
		}
		
		// Here, element interators in reverse order
		ListIterator<Integer> list1=abc.listIterator(abc.size());
		
		while(list1.hasPrevious())
		{
			int xyz1=list1.previous();
					{
			System.out.println(xyz1);
					}
		}
	}

}
