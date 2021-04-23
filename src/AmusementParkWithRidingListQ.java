public class AmusementParkWithRidingListQ {
    public static void main(String[] args) {
        AmusementPartWithRidingList a = new AmusementPartWithRidingList("wonderland", 160);
        Person2 p1 = new Person2("akash",175);
        Person2 p2 = new Person2("suresh",165);
        Person2 p3 = new Person2("naveen",155);

        if(a.isEligible(p1)){
            System.out.println(p1.getName() + ", is allowed on ride.");
        }else{
            System.out.println(p1.getName() + ", is not allowed on ride.");
        }
        if(a.isEligible(p2)){
            System.out.println(p2.getName() + ", is allowed on ride.");
        }else{
            System.out.println(p2.getName() + ", is not allowed on ride.");
        }
        if(a.isEligible(p3)){
            System.out.println(p3.getName() + ", is allowed on ride.");
        }else{
            System.out.println(p3.getName() + ", is not allowed on ride.");
        }

        System.out.println(a);
        System.out.println("Average Height Of riders: " + a.averageHeight());

        Person2 tallest = a.getTallest();
        System.out.println(tallest.getName());

    }
}
