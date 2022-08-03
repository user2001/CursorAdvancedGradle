package Task3;

import java.util.concurrent.ConcurrentHashMap;

public abstract class Genre {
    ConcurrentHashMap<String, String> store= Storage.concurrentHashMap;
    void getSong(String key){
        System.out.println(this.store.get(key));
    }
}

