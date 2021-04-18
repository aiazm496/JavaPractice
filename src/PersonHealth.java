public class PersonHealth {
    private String name;
    private int age;
    private int weight;
    private int height;


    public PersonHealth(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public PersonHealth(String name){
        this(name,0,0,0);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString(){
        return this.name + ",age: " + this.age + ",weight: " + this.weight + " and height: " + this.height;
    }
}
