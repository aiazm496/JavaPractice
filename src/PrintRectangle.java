public class PrintRectangle {
    public static void main(String[] args) {
        printRectangle(10,3);
    }

    public static void printRectangle(int a, int b){
        for(int i = 0; i <b; i++){
            for(int j = 0; j < a; j++){
                System.out.print('*');
            }
            System.out.println("\n");
        }
    }

}
