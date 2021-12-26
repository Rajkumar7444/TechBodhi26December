package collectionframework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
		
TreeMap<Integer,String> ab= new TreeMap<Integer,String>();
		
		ab.put(111,"Amit");
		ab.put(125,"Shubham");
		ab.put(118,"Suarabh");
		ab.put(101,"Sanket");
		
		System.out.println("Initial list of Elements:");
		for(Map.Entry m:ab.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
