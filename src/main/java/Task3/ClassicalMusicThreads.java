package Task3;

import java.util.concurrent.ConcurrentHashMap;

public class ClassicalMusicThreads implements Runnable {
    private ConcurrentHashMap<String, String> classicStore = Storage.concurrentHashMap;

    @Override
    public void run() {
        classicStore.put("Bach", "Symphony1");
        classicStore.put("Beethoven", "Symphony2");
        classicStore.put("Mozart", "Symphony5");
    }

    public void getSong(String key) {
        System.out.println(classicStore.get(key));
    }

}
