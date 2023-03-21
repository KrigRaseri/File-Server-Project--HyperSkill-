package file_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileServerMenu implements Runnable {
    @Override
    public void run() {
        FileServerMenu();
    }

    public void FileServerMenu() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            FileServerFiles f = new FileServerFiles();

            while (true) {
                //System.out.print("Input command (add/get/delete/exit): ");
                String[] command = reader.readLine().split(" ");
                switch (command[0]) {
                    case "add":
                        f.addFile(command[1]);
                        continue;

                    case "get":
                        f.getFile(command[1]);
                        continue;

                    case "delete":
                        f.deleteFile(command[1]);
                        continue;

                    case "exit":
                        break;

                    default:
                        continue;
                }
                break;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
