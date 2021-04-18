import org.jetbrains.annotations.NotNull;

public class PaymentTerminal {

    private double money;
    private int heartilyMeals;
    private int affordableMeals;

    public PaymentTerminal(){
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartilyMeals = 0;
    }

    public String toString(){
        return this.money + ", heartily meals: " + this.heartilyMeals + " and affordable meals: " + this.affordableMeals;
    }

    public double eatAffordableMeals( double amount){
        if(amount<2.50){
            return amount;
        }

        double change = amount - 2.50;
        this.affordableMeals++;
        this.money+=2.50;
        return change;
    }

    public double eatHeartilyMeals( double amount){
        if(amount<4.30){
            return amount;
        }
        double change = amount - 4.30;
        this.heartilyMeals++;
        this.money+=4.30;
        return change;
    }

    //card payment obj

    public void eatHeartily(@NotNull PaymentCard p){
        if(p.afford(4.30)){
            System.out.println("Transaction succesfull!.");
            this.heartilyMeals++;
            System.out.println("Card Balance: " + p.getBalance());
            return;
        }
        System.out.println("Payment Denied due to insufficient balance.");
        System.out.println("Card Balance: " + p.getBalance());

    }

    public void eatAffordable(PaymentCard p){
        if(p.afford(2.50)){
            System.out.println("Transaction succesfull!.");
            this.affordableMeals++;
            System.out.println("Card Balance: " + p.getBalance());
            return;
        }
        System.out.println("Payment Denied due to insufficient balance.");
        System.out.println("Card Balance: " + p.getBalance());
    }

}

