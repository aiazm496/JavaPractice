import java.util.ArrayList;

public class ArrayListAndArrayIntro {
    public static void main(String[] args) {

        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;

        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for(int j : list){
            System.out.println(j);
        }
    }
}
