import java.util.Scanner;

public class UserInterfaceQ {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        WordSet set = new WordSet();
        UserInterface u = new UserInterface(scanner, set);
        u.start();
        System.out.println(set.contains("akash"));  //u will change set to as ref var,

    }
}
