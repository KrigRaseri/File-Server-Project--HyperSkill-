package file_client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class ServerClient implements Runnable{

    @Override
    public void run() {
        runClient();
    }

    public static void runClient() {
        final String address = "127.0.0.1";
        final int port = 23456;

        try (Socket socket = new Socket(InetAddress.getByName(address), port);
             DataInputStream input = new DataInputStream(socket.getInputStream());
             DataOutputStream output = new DataOutputStream(socket.getOutputStream())) {

            System.out.println("Client started!");
            System.out.println("Sent: Give me everything you have!");
            output.writeUTF("Give me everything you have!");
            System.out.println("Received: " + input.readUTF());

        } catch (
        IOException e) {
            throw new RuntimeException(e);
        }
    }
}
