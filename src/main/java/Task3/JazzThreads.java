package Task3;

import java.util.concurrent.ConcurrentHashMap;

public class JazzThreads implements Runnable {
    private ConcurrentHashMap<String, String> jazzStore = Storage.concurrentHashMap;

    @Override
    public void run() {
        jazzStore.put("Jazz1", "JazzSong1");
        jazzStore.put("Jazz2", "JazzSong2");
        jazzStore.put("Jazz3", "JazzSong3");
    }

    public void getSong(String key) {
        System.out.println(jazzStore.get(key));
    }
}

