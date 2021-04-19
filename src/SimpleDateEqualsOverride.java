public class SimpleDateEqualsOverride {
    public static void main(String[] args) {
        SimpleDate s1 = new SimpleDate(3,12,1996);
        SimpleDate s2 = new SimpleDate(3,12,1996);

        System.out.println(s1.equals(s2));
        //override equals method such that object with same parameters will be same.

    }
}
