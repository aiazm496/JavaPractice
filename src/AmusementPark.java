public class AmusementPark {
    private String name;
    private int minHeight;
    private int visitersCount;

    public AmusementPark(String name, int minHeight){
        this.name = name;
        this.minHeight = minHeight;
        this.visitersCount = 0;
    }

    public boolean isEligible(Person2 p){
        if(p.getHeight() < this.minHeight){
            return false;
        }
        this.visitersCount++;
        return true;
    }

}
