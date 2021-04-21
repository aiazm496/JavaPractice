import java.util.Scanner;

public class CodeForces282A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;

        int statements = Integer.parseInt(scanner.nextLine());

        while(statements>0){
            String Operation = scanner.nextLine();
            if(Operation.charAt(0)=='+' || Operation.charAt(Operation.length()-1)=='+'){
                x++;
                statements--;
                continue;
            }
            x--;
            statements--;
        }
        System.out.println(x);

    }
}
