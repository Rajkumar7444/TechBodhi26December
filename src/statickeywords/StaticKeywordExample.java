package statickeywords;

public class StaticKeywordExample {
	//int count=0;
	
	static int count;
	
	StaticKeywordExample()
	{
		count++;
		
	}
void getcount()
{
	System.out.println(+count);
}

public static void main(String[] args) {
	
	StaticKeywordExample ab= new StaticKeywordExample();
	ab.getcount();
	StaticKeywordExample cd= new StaticKeywordExample();
	cd.getcount();
	StaticKeywordExample ef= new StaticKeywordExample();
	ef.getcount();
	
}
}
