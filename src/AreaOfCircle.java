import java.awt.*;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.nextLine());
        double area = 3.14 * radius * radius;
        System.out.println(area);

    }
}
