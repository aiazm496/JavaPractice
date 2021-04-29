public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5,3,2,6,3,5,3};
        //lets find index of 3
        System.out.println("index of 8: " + findIndex(arr,8));
        System.out.println("index of 3: " + findIndex(arr,3));

    }

    public static int findIndex(int[] arr, int number){
        for (int i =0 ; i<arr.length; i++){
            if(arr[i]==number){
                return i;
            }
        }
        return -1;
    }

}
