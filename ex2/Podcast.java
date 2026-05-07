package ex2;

public class Podcast implements Media, Playable {
    private String title;
    private int duration;
    private String host;
    private String topic;

    public Podcast(String title, int duration, String host, String topic) {
        this.title = title;
        this.duration = duration;
        this.host = host;
        this.topic = topic;
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
        System.out.println("Now playing: " + title + " by " + host);
    }

    @Override
    public String toString() {
        return "Podcast: Title=" + title + ", Host=" + host + ", Topic=" + topic + ", Duration=" + duration + " minutes";
    }
}