import java.io.File;
//import java.io.FileInputStream;
//import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class LabArrayList 
{
	public static void main(String[] args) throws Exception
	{
		ArrayList<Object> list = new ArrayList<Object>();
		File f=new File("C:\\Users\\renes\\Downloads\\currencies.csv");
			
		Scanner sc=new Scanner(f);

		int counter = 0;
		
		while(counter < 147)
		{
			list.add(sc.nextLine());
			System.out.println(list);
			counter ++;
		}
	}
	
}

//	public static void main(String[] args) throws Exception
//	{
//	File Excel = new File("/Users/renes/Downloads/currencies");
//	FileInputStream fileln = new FileInputStream(Excel);
//	ObjectInputStream in = new ObjectInputStream(fileln);
//	
//	Object o = in.readObject();
//	ArrayList<String> s =(ArrayList<String>)o;
//	for(String item:s) 
//	{
//		System.out.println(item);
//	}
//	}
	
	//--------------------------
//	FileInputStream fis;
//	public LabArrayList(File f) throws Exception
//	{
//		fis.new FileInputStream(f);
//	}
//	public String nextLine() throws Exception
//	{
//		int i;
//		String s = " ";
//		while((i=fis.read())!=-1) {
//			if(i=='\n');
//			{
//				return s;
//			}
//			s+=(char)i;
//		}
//		return null;
//	}
//	
//	
//	
//	//System.out.println(sc.nextLine());
//
//}
//public static void main(String[] args) throws Exception
//{
//File f=new File("/Users/renes/Downloads/currencies");
//
//MyScanner sc=new MyScanner(f);
	
//FileInputStream fis;
//	
//	public LabArrayList(File f) throws Exception 
//	{
//		fis=new FileInputStream(f);
//    }
//	public String nextLine() throws Exception 
//	{
//		int i;
//		String s="";
//		
//		while((i=fis.read())!=-1) 
//		{
//			if(i=='\n') 
//			{
//				return s;
//			}
//			s+=(char)i;
//        }
//		return null;
//	}



//	for(Object File : s)
//	{
//		System.out.println(sc);
//	}
//	System.out.println();
//	}


