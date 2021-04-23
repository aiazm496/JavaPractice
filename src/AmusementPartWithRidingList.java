import java.awt.*;
import java.util.ArrayList;

public class AmusementPartWithRidingList {
    private String name;
    private int minHeight;
    private int visitors;
    private ArrayList<Person2> riders;

    public AmusementPartWithRidingList(String name , int minHeight){
        this.name = name;
        this.minHeight = minHeight;
        this.visitors = 0;
        this.riders = new ArrayList<>();

    }

    public boolean isEligible(Person2 p){
        if(p.getHeight() >= this.minHeight){
            this.visitors++;
            this.riders.add(p);
            return true;
        }

        return false;
    }

    public double averageHeight(){
        if(this.riders.isEmpty()){
            return -1;
        }
        int totalRiders = this.riders.size();
        int sumHeight = 0;
        for(Person2 i :this.riders){
            sumHeight+=i.getHeight();
        }
        return 1.0*sumHeight/totalRiders;

    }

    public Person2 getTallest(){
        if(this.riders.isEmpty()){
            return null;
        }
        Person2 maxPerson = this.riders.get(0);   //assuming first Person is max height.
        for(Person2 p : this.riders){
            if(p.getHeight()> maxPerson.getHeight()){
                maxPerson = p;
            }

        }
        return maxPerson;
    }

    public String toString(){
        if(this.riders.isEmpty()){
            return  this.name + ", min Height Required: " + this.minHeight + ", no of visitors: " + this.visitors
                    + "\n" + "Riding: " + "\n" + "there is no one on ride";
        }

        String onRide = "";
        for(Person2 i : this.riders){
           onRide = onRide + i.getName() + "\n";
        }
        return this.name + ", min Height Required: " + this.minHeight + ", no of visitors: " + this.visitors
                + "\n" + "Riding: " + "\n" + onRide;

    }



}
