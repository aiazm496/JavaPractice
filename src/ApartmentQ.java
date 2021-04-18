//we need to compare two apartments which have rooms, area, totalprice
//compare which of the two is bigger and also the price difference.

public class ApartmentQ {
    public static void main(String[] args) {
        Apartment a1 = new Apartment(4,500,100000);
        Apartment a2 = new Apartment(5,400,120000);

        System.out.println("a1 is bigger than a2: " + a1.isBigger(a2));
        System.out.println("a1 is expensive than a2: " + a1.isExpensive(a2));
    }
}
