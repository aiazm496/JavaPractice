public class SongEq {
    public static void main(String[] args) {
        Song s1 = new Song("cheapthrills",2016);
        Song s2 = new Song("cheapthrills",2016);

        System.out.println(s1.equals(s2));
    }
}
