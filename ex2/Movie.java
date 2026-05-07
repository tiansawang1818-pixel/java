package ex2;

// Movie.java
public class Movie implements Media, Playable {
    private String title;
    private int duration;
    private String director;
    private double rating;

    public Movie(String title, int duration, String director, double rating) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.rating = rating;
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
        System.out.println("Now playing: " + title + " by " + director);
    }

    @Override
    public String toString() {
        return "Movie: Title=" + title + ", Director=" + director + ", Rating=" + rating + ", Duration=" + duration + " minutes";
    }
}