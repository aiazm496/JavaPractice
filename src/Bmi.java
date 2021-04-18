public class Bmi {
    private String name;
    private int height;
    private int weight;

    public Bmi(String name){
        this.name = name;
        this.height = 0;
        this.weight = 0;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double bodyMassIndex(){  //bmi = wt(kg)/h(metres) * h(metres)
        double heightM = this.height/100.0;
        return this.weight/(heightM*heightM);
    }

}
