public class PasswordCheckOops {
    private String password;

    public PasswordCheckOops(){
        this.password  = "abc@123";
    }

    public void checkPasswordOops(String s){
        if(s.equals(this.password)){
            System.out.println("correct password");
        }else{
            System.out.println("incorrect password!");
        }
    }

}
