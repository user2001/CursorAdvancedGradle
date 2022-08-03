package Task3;

public class Rock extends Genre implements Runnable {
    @Override
    public void run() {
        this.store.put("ACDC", "Highway");
        this.store.put("Metallica", "Nothing else matters");
        this.store.put("Rolling Stones", "Sympathy For The Devil");
    }
}
