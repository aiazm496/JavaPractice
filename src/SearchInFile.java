//search for numbers in numbers.txt
//add to array list

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchInFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();

        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            while (fileScanner.hasNextLine()){
                String number = fileScanner.nextLine();
                list.add(number);
            }
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        for(String s: list){
            System.out.println(s);
        }

        String toSearch = scanner.nextLine();

        if(list.contains(toSearch)){
            System.out.println("found");
        }else{
            System.out.println("Not found!");
        }

    }
}
