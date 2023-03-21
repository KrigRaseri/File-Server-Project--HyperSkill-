package file_server;


/**
 * File server project will make a file server using socket, files, and multithreading.
 *
 * @author Krig Raser (pen name), https://github.com/KrigRaseri
 * */

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new FileServerMenu());
        t.start();
        synchronized (t) {
            try {
                t.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

