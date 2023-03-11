package IO.Socket.SingleConnection;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(1234);
        Socket clientSocket = serverSocket.accept();

        DataInputStream dataInputStream = new DataInputStream(clientSocket.getInputStream());
        String input = dataInputStream.readUTF();
        System.out.println(input);

        dataInputStream.close();
        clientSocket.close();
        serverSocket.close();

    }

}