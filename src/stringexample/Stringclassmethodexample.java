package stringexample;

public class Stringclassmethodexample {
	
	public static void main(String[]args) {
		
		String s = "My name is Rajkumar Patil";
		
		// 1. Length method
		
	int length = s.length();
	
	System.out.println("length od string is -"+length);
	
//2.charAt method
	char charatt=s.charAt(5);
	System.out.println("charactor at particular index:-"+charatt);
	
	//3. substring method
	
	String fullname=s.substring(11);
	System.out.println("substring:-"+fullname);
	String name=s.substring(11,17);
	System.out.println("substring:-"+name);
	
	//4. Equal method
	String s1="Rajkumarpatil";
	String s2="Rajkumar";
	System.out.println("equals method:"+s1.equals(s2));
	
	//contains method
	System.out.println("contains method:"+s1.equals(s2));
	
	
//5. index of, last indexof
	System.out.println("index of method 1:"+s.indexOf('a'));
	System.out.println("index of method 2:"+s.indexOf('t',9));
	System.out.println("index of method 3:"+s.indexOf("Patil"));
	System.out.println("Last index of method 1:"+s.lastIndexOf('a'));
	
	//6. concat
	
	String con1="Rajkumar";
	String con2="Patil";
	System.out.println("concat:-"+con1.concat(con2));
	
	//7. Replace method
	System.out.println("replace:-"+s.replace("Rajkumar", "Patil"));
	
	//8. uppercase lowercase
	
	System.out.println("uppercase:-"+s.toUpperCase());
	System.out.println("lowercase;-"+s.toLowerCase());
	
	//9. Split method
	String[] splt = s.split(" ");
	for(String a:splt) {
		{
			System.out.println("eachvalue of splitted string:---"+a);
		}
	}
	
	// 10. joint
	String gfg1 = String.join("<", "four","five","six","seven");
	System.out.println("JoinExample---"+gfg1);
	
	}
	
	
}

