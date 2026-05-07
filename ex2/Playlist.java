package ex2;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Media> lstmedia;
    public Playlist(){
        lstmedia=new ArrayList<>();
    }   

    public void addMedia(Media media){
        lstmedia.add(media);
    }

    public int getTotalDuration(){
        int total=0;
        for(Media i:lstmedia){
            total+=i.getDuration();
        }
        return total;
    }

    public void playAll(){
        for(Media i:lstmedia){
            Playable x=(Playable) i;
            x.play();
        }
        
    }

    

public static void main(String[] args) {
        System.out.println("Creating Media...");
        
        // สร้าง Object ของ Media ต่างๆ
        Song song = new Song("Bohemian Rhapsody", 355, "Queen", "Rock");
        System.out.println(song.toString());
        
        Movie movie = new Movie("Inception", 148, "Christopher Nolan", 8.8);
        System.out.println(movie.toString());
        
        Podcast podcast = new Podcast("The Daily", 20, "Michael Barbaro", "News");
        System.out.println(podcast.toString());
        
        System.out.println("\nAdding Media to Playlist...");
        
        // สร้าง Object ของ Playlist และเพิ่ม Media
        Playlist playlist = new Playlist();
        playlist.addMedia(song);
        playlist.addMedia(movie);
        playlist.addMedia(podcast);
        
        // แสดงความยาวรวมทั้งหมด
        System.out.println("Total Playlist Duration: " + playlist.getTotalDuration() + " minutes\n");
        
        // เล่น Media ทั้งหมด
        System.out.println("Playing Playlist:");
        playlist.playAll();
    }
}