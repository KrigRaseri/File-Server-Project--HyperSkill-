package file_client;


public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new ServerClient());
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