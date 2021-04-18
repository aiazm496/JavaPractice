import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class SumOfArray {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Sum: " + sum(list));
    }


    public static int sum(ArrayList<Integer> l){
        int sum = 0;
        for(int i : l) {
            sum+=i;
        }
        return sum;
    }

}
