package file_server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void serverRun() {
        String address = "127.0.0.1";
        int port = 23456;

        try (ServerSocket server = new ServerSocket(port, 50, InetAddress.getByName(address));
             Socket socket = server.accept();
             DataInputStream input = new DataInputStream(socket.getInputStream());
             DataOutputStream output  = new DataOutputStream(socket.getOutputStream())) {

            System.out.println("Server started!");
            System.out.println("Received: " + input.readUTF());
            System.out.println("Received: All files were sent!");
            output.writeUTF("All files were sent!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
