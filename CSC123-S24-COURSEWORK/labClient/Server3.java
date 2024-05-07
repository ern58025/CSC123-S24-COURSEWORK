
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Server3 {      

	ServerSocket server = new ServerSocket(1200)
	while(true)
	{
		new Worker(server.accept());
	}

}