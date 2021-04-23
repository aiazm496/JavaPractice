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

    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        Item heaviest = this.items.get(0); //considering first item ob in list to be heaviest.
        for(Item i : this.items){
            if(i.getWeight()>heaviest.getWeight()){
                heaviest = i;
            }
        }

        return heaviest;

    }

    public void printItems(){
        if(this.items.isEmpty()){
            System.out.println("no items present");
        }
        for(Item i : this.items){
            System.out.println(i);
        }
    }

    public String toString(){
        if(this.items.isEmpty()){
            return "no items";
        }
        if(this.items.size()==1){
            return this.items.size() + " item " + "(" +  this.totalWeight() +  " kg)";
        }

        return this.items.size() + " items " + "(" +  this.totalWeight() +  " kg)";

    }

}
