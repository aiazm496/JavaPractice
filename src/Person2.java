public class Person2 {
    private String name;
    private int height;

    public Person2(String name, int height){
        this.name = name;
        this.height = height;
    }

    public String getName(){
        return this.name;
    }

    public int getHeight(){
        return  this.height;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
