package Task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Genre jazzThreads = new Jazz();
        Genre rapThreads = new Rap();
        Genre classicalMusicThreads = new Classical();
        Genre hipHopThreads = new HipHop();
        Genre rockThreads = new Rock();
        Thread thread1 = new Thread((Runnable) jazzThreads);
        Thread thread2 = new Thread((Runnable) rapThreads);
        Thread thread3 = new Thread((Runnable) classicalMusicThreads);
        Thread thread4 = new Thread((Runnable) hipHopThreads);
        Thread thread5 = new Thread((Runnable) rockThreads);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        System.out.println("Storage contains:");
        System.out.println(Storage.concurrentHashMap);
        rapThreads.getSong("Jazz3");
        jazzThreads.getSong("Kalush");
        classicalMusicThreads.getSong("Kalush");
        rockThreads.getSong("Bach");
        hipHopThreads.getSong("Metallica");
    }
}
