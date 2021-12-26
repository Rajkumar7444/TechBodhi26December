package exeptionhandling;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptions2 {
	
	public static void main(String[] args)
	
	throws IOException
	{
		FileInputStream abc=null;
		abc = new FileInputStream("E:\\\\Rajkumar Patil\\\\ABC.txt");
		//abc = new FileInputeStream("E:\\\\Rajkumar Patil\\\\ABC.txt");
		int k;
		
		while((k=abc.read() )!=-1)
		{
			System.out.println((char)k);
		}
		abc.close();
	}

}
