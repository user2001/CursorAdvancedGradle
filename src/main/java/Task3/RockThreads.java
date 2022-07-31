package Task3;

import java.util.concurrent.ConcurrentHashMap;

public class RockThreads implements Runnable {
    private ConcurrentHashMap<String, String> rockStore = Storage.concurrentHashMap;

    @Override
    public void run() {
        rockStore.put("ACDC", "Highway");
        rockStore.put("Metallica", "Nothing else matters");
        rockStore.put("Rolling Stones", "Sympathy For The Devil");
    }

    public void getSong(String key) {
        System.out.println(rockStore.get(key));
    }

}
