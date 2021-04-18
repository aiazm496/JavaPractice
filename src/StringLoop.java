public class StringLoop {
    public static void main(String[] args) {
        String s = "akash";
        for(int i = 0 ; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }

        String s2 = "akash";

        System.out.println(s.equals(s2));
    }
}
