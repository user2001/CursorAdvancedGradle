package Task2;

public class SongGetter implements Runnable {
    Song song;
    Thread thread;

    SongGetter (Song song) {
        this.song = song;
        thread = new Thread(this, "GetSong");
        thread.start();
    }

    public void run() {
        System.out.println("Thread: " + thread.getName() + ", get a file: " + song.get());
        System.out.println("Let's play this song: " + song.name);
    }
}

