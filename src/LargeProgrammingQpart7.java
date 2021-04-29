import java.util.Scanner;

public class LargeProgrammingQpart7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;
        int passingPoint = 50;
        int sumPasing = 0;
        int cntPassing = 0;
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (input < 0 || input > 100) {
                continue;
            }
            if (input >= passingPoint) {
                sumPasing += input;
                cntPassing++;
            }
            sum += input;
            cnt++;

        }
        System.out.println("Average: " + (1.0 * sum) / cnt);
        if (cntPassing == 0) {
            System.out.println("-");
        } else {
            System.out.println("average passing: " + (1.0 * sumPasing) / cntPassing);
        }
        System.out.println("Passing percentage: " + (100.0*cntPassing)/cnt);
    }
}