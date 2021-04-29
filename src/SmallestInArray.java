import javax.swing.*;
import java.util.Arrays;

public class SmallestInArray {
    public static void main(String[] args) {
        int[] arr = {6,5,1,8,7,2,11};
        System.out.println("smallest element: " + smallest(arr));
        System.out.println("index of smallest number: " + indexSmallest(arr));
        System.out.println("index of smallest number starting from index given: " + indexOfSmallestFrom(arr,4));
        swap(arr,0,1);
        System.out.println("Array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Array Sorted: " + Arrays.toString(arr));

    }

    public static int smallest(int[] arr){
        int smallest = arr[0];
        for(int i : arr){
            if(i < smallest){
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexSmallest(int[] arr){
        int smallestIndex = 0;
        for(int i = 1; i < arr.length ; i++){
            if(arr[i]<arr[smallestIndex]){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] arr, int startIndex){
        int smallestIndex = startIndex;
        for(int i = smallestIndex + 1; i < arr.length ; i++){
            if(arr[i]<arr[smallestIndex]){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] arr, int index_1, int index_2){
        int temp = arr[index_1];
        arr[index_1] = arr[index_2];
        arr[index_2] = temp;
    }

    public static void sort(int[] arr){
        for(int i = 0; i < arr.length-1;i++){
            int smallestIndex  = indexOfSmallestFrom(arr,i);
            swap(arr,smallestIndex,i);
        }
    }
}
