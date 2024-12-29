public class MyClass {
    private int x = 0;
    private final Object lock = new Object(); // Added lock object for synchronization

    public void incrementX() {
        synchronized (lock) { // Synchronized block to protect x
            x++;
        }
    }

    public int getX() {
        return x;
    }
}