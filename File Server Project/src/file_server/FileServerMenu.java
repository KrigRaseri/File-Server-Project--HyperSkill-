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

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
