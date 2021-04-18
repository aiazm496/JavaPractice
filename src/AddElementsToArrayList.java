//accept input till it is -1

import java.awt.desktop.ScreenSleepEvent;
import java.util.ArrayList;
import java.util.Scanner;
//from user input print greatest number


public class AddElementsToArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list =  new ArrayList<>();

        int max = 0;
        int n  = 0;
        while (true){
            int i = Integer.parseInt(scanner.nextLine());
            if(i==-1){
                break;
            }
            list.add(i);
            n = i;
            max = Math.max(n,max);
        }

        System.out.println("the greatest number in arraylist is: " + max);
    }

}
