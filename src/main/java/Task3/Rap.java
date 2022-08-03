package Task3;

public class Rap extends Genre implements Runnable {
    @Override
    public void run() {
        this.store.put("Kalush", "Stefania");
        this.store.put("Skofka", "Dim");
        this.store.put("VovaziLvova", "Serce");
    }

}
