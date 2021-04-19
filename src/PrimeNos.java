public class PrimeNos {
    public static void main(String[] args) {

        int a = 4;
        int b = 7;

        System.out.println(isPrime(a));
        System.out.println(isPrime(b));

        int c = 100;
        printPrime(c);
    }

    public static boolean isPrime(int n){  //O(sqrt(n)) better than O(n)
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int n){
        for(int i = 2 ; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

}
