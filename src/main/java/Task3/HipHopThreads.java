package Task3;

import java.util.concurrent.ConcurrentHashMap;

public class HipHopThreads implements Runnable {
    private ConcurrentHashMap<String, String> hiphopStore = Storage.concurrentHashMap;

    @Override
    public void run() {
        hiphopStore.put("L'Trimm", "Cars With the Boom");
        hiphopStore.put("M.I.A.", "Paper Planes");
        hiphopStore.put("Brand Nubian", "Slow Down");
    }

    public void getSong(String key) {
        System.out.println(hiphopStore.get(key));
    }

}
