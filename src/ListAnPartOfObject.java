import java.util.ArrayList;

public class ListAnPartOfObject {
    private ArrayList<String> songs;

    public ListAnPartOfObject(){
        this.songs = new ArrayList<>();
    }

    public void addSongs(String song){
        this.songs.add(song);
    }

    public void removeSong(String song){
        this.songs.remove(song);
    }

    public void printSongs(){
        for(String i : this.songs){
            System.out.println(i);
        }
    }

}
