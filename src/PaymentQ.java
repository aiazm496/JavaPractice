public class PaymentQ {
    public static void main(String[] args) {
        PaymentTerminal p = new PaymentTerminal();
        double change = p.eatAffordableMeals(10.0);
        System.out.println(change);
        System.out.println(p);
        double change2  = p.eatHeartilyMeals(7.30);
        System.out.println(change2);
        System.out.println(p);

        //card payments
        PaymentCard c1 = new PaymentCard(5.0);
        p.eatAffordable(c1);
        p.eatHeartily(c1);

    }

}
