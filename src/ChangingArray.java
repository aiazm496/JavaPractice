public class ChangingArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i : arr){
            System.out.println(i);
        }
        changeFirstElement(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void changeFirstElement(int[] a){
        a[0] = 99;
    }
}
