package Task3;

public class PlayerMain {
    public static void main(String[] args) throws InterruptedException {
        JazzThreads jazzThreads = new JazzThreads();
        RapThreads rapThreads = new RapThreads();
        ClassicalMusicThreads classicalMusicThreads = new ClassicalMusicThreads();
        HipHopThreads hipHopThreads = new HipHopThreads();
        RockThreads rockThreads = new RockThreads();
        Thread thread1 = new Thread(jazzThreads);
        Thread thread2 = new Thread(rapThreads);
        Thread thread3 = new Thread(classicalMusicThreads);
        Thread thread4 = new Thread(hipHopThreads);
        Thread thread5 = new Thread(rockThreads);
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
