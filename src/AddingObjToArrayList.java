import java.util.ArrayList;
import java.util.Scanner;

public class AddingObjToArrayList {
    public static void main(String[] args) {
        //Person p1 = new Person("Akash");
        //System.out.println(p1);
        //adding person object to ArrayList
        //stop when person enter empty string
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<>();
        while (true){
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            list.add(new Person(name));
        }
        for(Person s : list){
            System.out.println(s);
        }


    }
}
