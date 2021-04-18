//accept initial value , if not set to 0, increase by 1. Also create a method to return clone of current counter.

public class Counter {
    private int value;

    public Counter(){
        this(0);
    }

    public Counter(int value){
        this.value = value;
    }

    public void increase(){
        this.value+=1;
    }


    public String toString(){
        return "value: " + this.value;
    }

    public Counter clone(){
        return new Counter(this.value);
    }

}
