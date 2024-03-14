import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class MyFile 
{
	public static void main(String [] args) throws IOException
	{
		File source = new File("/Users/renes/Lab13F/file.txt");
		File dest = new File("/Users/renes/Lab13F/file.txt");
		
		if(!source.exists())
		{
			System.out.println("File does not exist!");
			System.exit(0);
		}
		if(!source.isFile())
		{
			System.out.println("Is not a file");
			System.exit(0);
		}
		if(!source.canRead())
		{
			System.out.println("Cant read file");
			System.exit(0);
		}
		if(dest.exists())
		{
			System.out.println("File Already Exists!");
			System.exit(0);
		}
		dest.createNewFile();
		
		if(!dest.canWrite())
		{
			System.out.println("Dest cant write");
			System.exit(0);
		}
		InputStream in = new FileInputStream(source);
		OutputStream out = new FileOutputStream(source);
		
		int i;
		while((i = in.read())!=-1)
		{
			out.write(i);
		}
		in.close();
		out.flush();
		out.close();
		
	}

}
