import java.util.ArrayList;
import java.util.Scanner;

public class TestingStringInput {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String input = "one\n" + "two\n"  +
                "three\n" + "four\n" +
                "five\n" + "one\n"  +
                "six\n";

        Scanner scanner = new Scanner(input);

        while (true){
            String word = scanner.nextLine();
            if(list.contains(word)){
                break;
            }
            list.add(word);
        }
        System.out.println("Thank you!");

        if(list.contains("six")){
            System.out.println("six should not have been added to the list.");
        }
    }
}
