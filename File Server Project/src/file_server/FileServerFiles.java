package file_server;

import java.io.*;

public class FileServerFiles {

    public void addFile(String fileName) {
        boolean result;
        File f = new File("File Server Project/Files/" + fileName);
        try {
            if (f.exists()) {
                System.out.printf("Cannot add the file %s\n", fileName);
            }

            else {
                result = f.createNewFile();
                if (result) {
                    System.out.printf("The file %s added successfully\n", fileName);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getFile(String fileName) {
        File f = new File("File Server Project/Files/" + fileName);

        if (f.exists()) {
            System.out.printf("The file %s was sent\n", fileName);
        } else {
            System.out.printf("The file %s not found\n", fileName);
        }
    }

    public void deleteFile(String fileName) {
        File f = new File("File Server Project/Files/" + fileName);
        if (f.exists()) {
            System.out.printf("The file %s was deleted\n", fileName);
            f.delete();
        } else {
            System.out.printf("The file %s not found\n", fileName);
        }
    }
}
