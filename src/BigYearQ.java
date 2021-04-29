import java.util.ArrayList;
import java.util.Scanner;

public class BigYearQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BirdDb> list = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Latin name: ");
                String latinName = scanner.nextLine();
                list.add(new BirdDb(name, latinName));
                names.add(name);
            }
            if (command.equals("Observation")) {
                System.out.print("Bird: ");
                String name = scanner.nextLine();
                if (!(names.contains(name))) {
                    System.out.println("Not a bird!");
                    continue;
                }
                for (BirdDb b : list) {
                    if (b.getName().equals(name)) {
                        b.setObs(b.getObs() + 1);
                    }
                }
            }
            if (command.equals("All")) {
                for (BirdDb b : list) {
                    System.out.println(b);
                }
            }
            if (command.equals("Quit")) {
                break;
            }
        }
    }
}