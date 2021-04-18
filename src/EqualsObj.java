public class EqualsObj {
    public static void main(String[] args) {
        SimpleDate s1 = new SimpleDate(2,11,1995);
        SimpleDate s2 = new SimpleDate(2, 11, 1995);

        System.out.println(s1.equals(s2));
        s2 = s1;
        System.out.println(s1.equals(s2));

        s2 = null;
        System.out.println(s2.afterNumberOfDays(2));// null pointer exc

    }
}
