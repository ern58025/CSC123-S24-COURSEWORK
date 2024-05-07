import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class MyScanner 
{
//	public MyScanner(String fileName) throws IOException 
//	{
//		Scanner keyboard = new Scanner(System.in);
//
//		FileInputStream fis = new FileInputStream("/Users/renes/Lab13F");
//		String fis = keyboard.nextLine();
//		
//		System.out.println(fis.nextLine());
//		System.out.println(fileName.nextLine());
//		
//		
//	}
	
	//got from FileTest1.java
	FileInputStream fis;
	
	public MyScanner(File f) throws Exception
	{
		fis = new FileInputStream(f);
	}
	public String nextLine() throws Exception
	{
		int i;
		StringBuffer s = new StringBuffer();           //String buffer
		while((i=fis.read())!=-1)
		{
			if(i=='\n')                                //use '\n'
			{
				return s;
			}
			s.append((char)i);
			
		}
		return null;
	}
	
	
}

//import java.io.File;
//public class ScannerTest
//{
//	public static void main(String[] args) throws Exception
//	{
//		file f = new file("/Users/renes/Lab13F");
//		MyScanner sc new MyScanner(f);
//		
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());
//	}
//}
//













