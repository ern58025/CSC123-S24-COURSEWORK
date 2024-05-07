import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

public class FileTest3 {

	public static void main(String[] args) throws IOException 
	{

		File f = new File("/Users/renes/Lab13F");
		MyFile1 mf=new MyFile1("/Users/renes/Lab13F/file.txt");
		
		System.out.println(mf);
	

	}

}
