public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    public int area(){
        return this.length*this.breadth;
    }

}
