import java.util.Arrays;

public class BinarySearch {  //only works with sorted array/list
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8, 9};
        //search for 7 - print index too
        System.out.println(binarySearch(arr,7));
        System.out.println(binarySearch(arr,6));
    }

    public static int binarySearch(int[] arr, int number) {
        int begin = 0;
        int end = arr.length - 1;
        while (begin <= end) {
            int middle = (begin + end) / 2;
            if (number == arr[middle]) {
                System.out.println("Number found at index: " + middle);
                return middle;
            }
            if (number > arr[middle]) {
                begin = middle + 1;
            }
            if (number < arr[middle]) {
                end = middle - 1;
            }
        }
        return -1;
    }
}