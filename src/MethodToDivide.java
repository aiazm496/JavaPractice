import java.util.Scanner;

public class MethodToDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        double result = divide(a,b);
        System.out.println(result);
    }

    public static  double divide(int a , int b){
        return a/(b*1.0);
    }

}
