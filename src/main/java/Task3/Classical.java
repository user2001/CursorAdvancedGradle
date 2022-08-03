package Task3;

public class Classical extends Genre implements Runnable {
    @Override
    public void run() {
        this.store.put("Bach", "Symphony1");
        this.store.put("Beethoven", "Symphony2");
        this.store.put("Mozart", "Symphony5");
    }
}
