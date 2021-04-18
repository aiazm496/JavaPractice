public class ChangeRefVarViaMethod {
    public static void main(String[] args) {
        SimpleDate s1 = new SimpleDate(3,12,1996);
        System.out.println(s1);

        SimpleDate s2 = s1;
        changeDay(s2);

        System.out.println(s1);

    }

    public static void changeDay(SimpleDate s){
        s.setDay(5);
    }

}
