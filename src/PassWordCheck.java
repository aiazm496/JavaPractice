import java.util.Scanner;

public class PassWordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        passwordCheck(password); //with functional programming, you have exposed the password.
        PasswordCheckOops p = new PasswordCheckOops();  //with OOPs you didn't expose your password and checking algo.
        p.checkPasswordOops(password);

    }
    public static void passwordCheck(String s){
        if(s.equals("abc@123")){
            System.out.println("Correct Password!");
            return;
        }
        System.out.println("Incorrect Password");
    }
}
