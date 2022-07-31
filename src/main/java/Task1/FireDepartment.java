package Task1;

import java.util.Random;

public class FireDepartment implements Runnable {
    int signal;

    @Override
    public synchronized void run() {
        waitAndRun();
        System.out.println("Time to work! " + Thread.currentThread().getName() + " people need your help!");
    }

    public synchronized void waitAndRun() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            signal = random.nextInt(1000);
            if (signal <= 450) {
                try {
                    System.out.println("Keep calm.No work for " + Thread.currentThread().getName() + " at the moment");
                    wait(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else break;
        }
    }
}
