//Bmi of a person is calculated. the only input is name, give option to set height and weight


public class BmiQ {
    public static void main(String[] args) {
        Bmi b = new Bmi("Akash");
        b.setHeight(175);
        b.setWeight(71);
        System.out.println(b.bodyMassIndex());
    }
}
