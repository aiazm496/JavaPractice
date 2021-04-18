public class TypeConversion {
    public static void main(String[] args) {
        int a  = 2;
        double b = a;
        System.out.println(b); //since double is higher at hierarchy int is auto-casted to double.

        //int c = b; it will give error since it is a case of narrow casting, so it won't auto cast
        //you need to use narrow casting

        int c = (int)b;
        System.out.println(c);

        char d = 'A';
        int e = d;
        System.out.println(e);

        int f = 4;
        char g = (char)f;
        System.out.println(g);

    }
}
