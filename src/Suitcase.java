import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item i){
        if(i.getWeight()>this.maxWeight){
            return;
        }
        this.items.add(i);
    }

    public int totalWeight(){
        if(this.items.isEmpty()){
            return  0;
        }
        int totalWeight = 0;
        for(Item i  : this.items){
            totalWeight+=i.getWeight();
        }
        return totalWeight;
    }

    public String toString(){
        return this.items.size() + " items " + "(" +  this.totalWeight() +  " kg )";

    }

}
