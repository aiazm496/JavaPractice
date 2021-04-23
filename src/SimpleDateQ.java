public class SimpleDateQ {
    public static void main(String[] args) {
        SimpleDate s1 = new SimpleDate(3,12,1996);
        System.out.println(s1);
        SimpleDate s2 = s1.afterNumberOfDays(15);
        System.out.println(s2);
        SimpleDate s3 = s2.afterNumberOfDays(15);
        System.out.println(s3);

        SimpleDate s4 = new SimpleDate(3,12,1996);
        System.out.println(s1.equals(s4));  //overriden equals method such that obj with equal value will be considered equal.

    }
}
