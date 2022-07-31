package Task3;

import java.util.concurrent.ConcurrentHashMap;

public class RapThreads implements Runnable {
    private ConcurrentHashMap<String, String> rapStore = Storage.concurrentHashMap;

    @Override
    public void run() {
        rapStore.put("Kalush", "Stefania");
        rapStore.put("Skofka", "Dim");
        rapStore.put("VovaziLvova", "Serce");
    }

    public void getSong(String key) {
        System.out.println(rapStore.get(key));
    }

}
