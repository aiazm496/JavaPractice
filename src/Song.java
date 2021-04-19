public class Song {
    private String name;
    private int year;

    public Song(String name, int year){
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString(){
        return this.name + ", " + this.year;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(!(o instanceof Song)){
            return false;
        }

        Song s = (Song) o;
        if(this.name == s.name && this.year == s.year){
            return true;
        }
        return false;


    }
}
