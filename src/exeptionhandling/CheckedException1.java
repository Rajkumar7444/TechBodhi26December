package exeptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException1 {
	
	public static void main(String[] args) {
		
		FileInputStream fs =null;
		
		//fs= new FileInputStream ("E:\\Rajkumar Patil\\ABC.txt");
		
		
		 try {
			fs= new FileInputStream ("E:\\Rajkumar Patil\\ABC.txt");
		} 
		 
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(" The specified file is not " + "Present at the given path");
		}
		
		int a;
		 try
		 {
			 while ((a=fs.read() )!=-1)
			 {
				 System.out.println((char)a);
			 }
			 fs.close();
		 }
		 catch(IOException ioe)
		 {
			 System.out.println("I/O error occurred:"+ioe);
	 }
	}

}
