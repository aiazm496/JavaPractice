import java.util.ArrayList;
import java.util.Scanner;

public class RemovingArrayListWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int i = Integer.parseInt(scanner.nextLine());
            if(i==-1){
                break;
            }
            list.add(i);
        }
        System.out.println(list);
        remove(list); //removed first element.
        System.out.println(list);
    }
    public static  void remove(ArrayList<Integer> l){
        l.remove(0);
    }

}
