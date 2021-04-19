public class PaymentCard {
    private double balance;

    public PaymentCard(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "PaymentCard{" +
                "balance=" + this.balance +
                '}';
    }

    public boolean afford(double amount){
        if(this.balance< amount){
            return false;
        }
        this.setBalance(this.getBalance()-amount);
        return true;
    }

}
