/*Write a program that asks the user for input until the user inputs 0. After this,
        the program prints the average of the numbers.
        The number zero does not need to be counted to the average.
        You may assume that the user inputs at least one number.*/

import java.util.Scanner;

public class WhileAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

        while (true){
            int i = Integer.parseInt(scanner.nextLine());
            if(i==0){
                break;
            }
            sum+=i;
            cnt++;
        }
        double average = (1.0*sum)/cnt;
        System.out.println(average);


    }

}
