import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int factorial = 1;

        while(number>=1){
            factorial = number*factorial;
            number--;
        }

        System.out.println("Factorial: " + factorial);

    }
}
