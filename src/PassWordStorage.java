public class PassWordStorage {

    private String password;

    public PassWordStorage(){
        this.password = "abc@123";
    }

    public void checkPassword(String s){
        if(s.equals(this.password)){
            System.out.println("correct password");
            return;
        }
        System.out.println("incorrect password!.");
    }

}
