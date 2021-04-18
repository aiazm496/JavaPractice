public class PersonSimpleDateParaQ {
    public static void main(String[] args) {
        SimpleDate s = new SimpleDate(3,12,1995);
        SimpleDate s2 = new SimpleDate(4,12,1995);

        PersonWithSimpleDateObjAsPara p = new PersonWithSimpleDateObjAsPara("Akash",s);
        System.out.println(p);

        PersonWithSimpleDateObjAsPara p2 = new PersonWithSimpleDateObjAsPara("Rakesh",s2);

        System.out.println(p.isOlder(p2));


    }
}
