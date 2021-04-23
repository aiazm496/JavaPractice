public class CargoHoldQ {
    public static void main(String[] args) {
        Item gadget = new Item("laptop", 2);
        Item book = new Item("HarryPotter", 1);

        System.out.println(gadget);
        System.out.println(book);

        Suitcase s = new Suitcase(4);
        System.out.println(s);
        s.addItem(gadget);
        s.addItem(book);
        System.out.println(s);

        Item food = new Item("Wheat", 5);
        s.addItem(food);
        System.out.println(s);
    }
}
