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

        System.out.println("Items list: ");
        s.printItems();

        Item heaviest = s.heaviestItem();
        System.out.print("Heaviest item: ");
        System.out.println(heaviest);

        Suitcase s2 = new Suitcase(2);
        s2.addItem(gadget);

        Hold h = new Hold(10);
        h.addSuitcase(s);
        h.addSuitcase(s2);

        System.out.println(h);

        System.out.println("Suitcase contain following items: ");
        h.printItems();

    }
}
