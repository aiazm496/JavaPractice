//check if for a amusement park, of many person
//if a person is eligible to enter or not.
//what are the no of eligible visitors
public class AmusementPartQ {
    public static void main(String[] args) {
        Person2 p1 = new Person2("Akash",175);
        AmusementPark a1 = new AmusementPark("Wonderland!",160);
        if(a1.isEligible(p1)){
            System.out.println(p1.getName() + " is eligible." );
        }else{
            System.out.println(p1.getName() + "is not eligible");
        }

    }
}
