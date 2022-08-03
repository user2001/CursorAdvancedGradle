package Task3;

import java.util.concurrent.ConcurrentHashMap;

public class HipHop extends Genre implements Runnable {
    @Override
    public void run() {
        this.store.put("L'Trimm", "Cars With the Boom");
        this.store.put("M.I.A.", "Paper Planes");
        this.store.put("Brand Nubian", "Slow Down");
    }
}
