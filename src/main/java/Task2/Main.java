package Task2;

public class Main {
    public static void main(String[] args) {
        Song song = new Song();
        new SongFormer(song);
        new SongGetter(song);
    }
}
