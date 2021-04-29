public class BirdDb {
    private String name;
    private String latinName;
    private int obs;

    public BirdDb(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.obs = 0;
    }

    public void setObs(int obs) {
        this.obs = obs;
    }

    public String getName() {
        return this.name;
    }

    public int getObs() {
        return this.obs;
    }
    @Override

    public String toString(){
        return this.name + " (" + this.latinName + " )" + ": " + this.obs + " observations.";
    }

}
