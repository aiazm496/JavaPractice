import java.util.Scanner;

public class PassWordQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        PassWordStorage p = new PassWordStorage();
        p.checkPassword(s);


    }

}
