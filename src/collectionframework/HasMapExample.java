package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapExample {
	
	public static void main(String[] args) {
		
		Map map=new HashMap();
		
		// Adding elements to map
		map.put(1, "Jeet");
		//map.put(1, "Raj");
		map.put(2,"Sopan");
		map.put(4,"Yaseen");
		map.put(3,"Ravi");
		System.out.println(map.get(1));
		
		// Traversing map
		Set set=map.entrySet(); // Converting to set so that we can traverse
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
