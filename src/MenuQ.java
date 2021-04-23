public class MenuQ {
    public static void main(String[] args) {
        Menu m1 = new Menu();
        m1.add("pizza");
        m1.add("burger");

        m1.printMeals();
        System.out.println(m1);

        m1.clear();
        m1.printMeals();



    }
}
