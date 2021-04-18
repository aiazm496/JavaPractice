//create an app such that it displays the weight of a person object and also can feed to increase
//weight by 1pound. note the number of weighing done on health machine. //

public class HealthQ {
    public static void main(String[] args) {
        PersonHealth p1 = new PersonHealth("akash",24,71,175);
        System.out.println(p1);

        Health h = new Health();
        System.out.println(h.weigh(p1));
        h.feed(p1);
        System.out.println(p1);
        System.out.println(h.getWeighings());

    }
}
