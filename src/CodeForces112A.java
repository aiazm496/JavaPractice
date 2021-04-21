import java.util.Locale;
import java.util.Scanner;

public class CodeForces112A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String one = scanner.nextLine().toLowerCase();
        String second = scanner.nextLine().toLowerCase();

        String result = "0";

        for (int i = 0; i < one.length(); i++) {
            if (second.charAt(i) > one.charAt(i)) {
                result = "-1";
                break;
            }
            if (second.charAt(i) < one.charAt(i)) {
                result = "1";
                break;
            }
        }
        System.out.println(result);
    }
}
