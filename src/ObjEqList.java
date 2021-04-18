import java.util.ArrayList;

public class ObjEqList {
    public static void main(String[] args) {
        SimpleDate s1 = new SimpleDate(3,12,1996);
        ArrayList<SimpleDate> list = new ArrayList<>();
        list.add(s1);
        System.out.println(list.contains(s1));
        s1 = new SimpleDate(3,12,1996); //although values are same, the object is new and on new memory location.
        System.out.println(list.contains(s1));


    }
}
