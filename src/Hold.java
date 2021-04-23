import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> container;

    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.container = new ArrayList<>();

    }

    public void addSuitcase(Suitcase s){
        if(s.totalWeight()>this.maxWeight){
            return;
        }
        this.container.add(s);
    }

    public int totalContainerWeight(){
        if(this.container.isEmpty()){
            return 0;
        }
        int totalContainerWeight = 0;
        for(Suitcase s : this.container){
            totalContainerWeight+=s.totalWeight();
        }
        return totalContainerWeight;
    }

    public void printItems(){
        if(this.container.isEmpty()){
            System.out.println("no items present!");
            return;
        }
        for(Suitcase s : this.container){
            s.printItems();
        }
    }

    public String toString(){
        if(this.container.isEmpty()){
            return "no suitcases present.";
        }

        return this.container.size() + " suitcases " + "(" + this.totalContainerWeight() + " kg)";

    }



}
