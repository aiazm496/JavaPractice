public class Average {
    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        int c = 7;

        System.out.println("average of three numbers: " + average(a,b,c));
    }

    public static double average(int a , int b , int c){
        return (1.0*a + b + c)/3;
    }

}
