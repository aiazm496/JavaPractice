public class Guage {
    private int value;

    public Guage(){
        this.value = 0;
    }

    public void increase(){
        if(this.value>=5){
            return;
        }
        this.value++;
    }

    public void reset(){
        this.value = 0;
    }

    public String toString(){
        return "Value: " + this.value;
    }
}
