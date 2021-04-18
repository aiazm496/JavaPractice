public class NullObj {
    public static void main(String[] args) {
        Person p = new Person("Akash");
        System.out.println(p);

        Person p2 = p;
        p2.setAge(2);
        System.out.println(p);

        p2 = null;
        p2.setAge(2); //nullpointerexception

    }
}
