package Task2;

public class Song {
    String name;
    boolean valueSet = false;

    synchronized String get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        valueSet = false;
        notify();
        return name;
    }

    // Метод, що використовується для передачі даних іншому потоку
    synchronized void put(String name) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        this.name = name;
        valueSet = true;
        notify();
    }
}



