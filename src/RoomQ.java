public class RoomQ {
    public static void main(String[] args) {
        Room r = new Room();
        System.out.println(r.isEmpty());
        r.add(new Person2("Akash",175));
        r.add(new Person2("Ravi",170));
        r.add(new Person2("Rahul",160));
        System.out.println(r.isEmpty());

        for(Person2 p : r.getPersons()){
            System.out.println(p);
        }

        System.out.println("Shortest:\n" + r.shortest());

        System.out.println("Removed shortest: " + r.take());


    }
}
