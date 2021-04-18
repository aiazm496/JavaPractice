public class SimpleDate2Q {
    public static void main(String[] args) {

        SimpleDate2 s1 = new SimpleDate2(1996,12,3);
        System.out.println(s1);
        SimpleDate2 s2 = s1.afterNumberOfDays(40);
        System.out.println(s2);

    }
}
