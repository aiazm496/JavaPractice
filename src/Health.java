public class Health {
    private int weighings;

    public Health(){
        this.weighings = 0;
    }

    public int weigh(PersonHealth p){
        this.weighings++;
        return p.getWeight();
    }

    public void feed(PersonHealth p){
        p.setWeight(p.getWeight()+1);
    }

    public int getWeighings() {
        return weighings;
    }
}
