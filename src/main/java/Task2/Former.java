package Task2;

public class Former implements Runnable {
    Song song;
    Thread thread;

    Former(Song song) {
        this.song = song;
        thread = new Thread(this, "SongFormer");
        thread.start();
    }

    public void run() {
        String songTitle = "Nothing else matters";
        System.out.println("Thread " + thread.getName() + ", create file: " + songTitle);
        song.put(songTitle);
    }
}
