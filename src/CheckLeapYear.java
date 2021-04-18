import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println(year + " is leap year: " + checkLeapYear(year));

    }
    //2004
    //2000
    //1900
    public static boolean checkLeapYear(int year){
        if(year%100==0){
          if(year%400!=0){
              return false;
          }
          return true;
        }
        if(year%4!=0){
            return false;
        }
        return true;
    }

}
