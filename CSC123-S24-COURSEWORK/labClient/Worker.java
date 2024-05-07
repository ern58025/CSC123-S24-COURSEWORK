import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Worker 
{
	InputStream in;
	OutputStream out;
	
	//Constructor
	public Worker(InputStream in, OutputStream out)
	{
		this.in = in;
		this.out = out;
		this.sock = sock;
		
	}
	private void serviceClient() throws IOException
	{
		String clientRequest = "";
		
		while(!clientRequest.equalsIgnoreCase("quit"))
		{
			clientRequest = readData(in);
			writeData(out, clientResponse);
		}
		
	}

}
