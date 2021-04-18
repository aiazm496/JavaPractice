import java.util.Scanner;

public class SplitSumSTr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr  = s.split(",");


        int sum = 0;
        for(String i : arr){
            sum+=Integer.parseInt(i);
        }
        System.out.println("Sum: " + sum);

    }

}
