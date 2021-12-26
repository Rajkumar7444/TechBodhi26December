package constructorexamples;

public class DefaultContructorExample {
	
	int id;
	String name;
	
	public void dislpay()
	{
		System.out.println(id+" "+name);
	}
	
	 public static void main(String args[])
	 {
	DefaultContructorExample patil=new DefaultContructorExample();
	DefaultContructorExample wagh=new DefaultContructorExample();
	
	patil.dislpay();
	wagh.dislpay();
	 
	 }
}
