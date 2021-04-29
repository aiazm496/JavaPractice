public class PersonDateQ {
    public static void main(String[] args) {
        SimpleDate3 s1 = new SimpleDate3(3,12,1996);
        Person3 p1 = new Person3("Akash",24,s1);
        SimpleDate3 s2 = new SimpleDate3(4,12,1996);
        Person3 p2 = new Person3("Ravi",24,s2);
        System.out.println("p1 older that p2: " + p1.isOlder(p2));


    }
}
