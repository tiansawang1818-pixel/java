package ex2;

// Song.java
public class Song implements Media, Playable {
    private String title;
    private int duration;
    private String artist;
    private String genre;

    public Song(String title, int duration, String artist, String genre) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void play() {
        System.out.println("Now playing: " + title + " by " + artist);
    }

    @Override
    public String toString() {
        return "Song: Title=" + title + ", Artist=" + artist + ", Genre=" + genre + ", Duration=" + duration + " minutes";
    }
}
