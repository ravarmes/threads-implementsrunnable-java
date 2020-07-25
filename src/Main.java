
public class Main {

    public static void main(String[] args) {
        MinhaRunnable minhaRunnable = new MinhaRunnable();
        Thread minhaThread = new Thread(minhaRunnable);
        minhaThread.start();
    }
}
