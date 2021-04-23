import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private WordSet wordSet;      //we can seperate concept into diff classes(abstraction) like WordSet and use its obj as instance var.

    public UserInterface(Scanner scanner, WordSet wordSet) {
        this.scanner = scanner;
        this.wordSet = wordSet;
    }

    public void start() {
        while (true) {
            String word = this.scanner.nextLine();
            if(this.wordSet.contains(word)){        //checking and adding words done in seperate class object wordSet.
                break;
            }
            this.wordSet.add(word);     //Wordset encaspsulates arraylist.
        }

        System.out.println("You have already entered the last word!.");

    }

}
