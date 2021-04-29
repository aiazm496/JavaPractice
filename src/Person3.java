public class Person3 {
    private String name;
    private int age;
    private SimpleDate3 birthday;

    public Person3(String name, int age,SimpleDate3 birthday){
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public boolean isOlder(Person3 p){
        if(this.birthday.before(p.birthday)){
            return true;
        }
        return false;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString(){
        return this.name + "is " + this.age + " old.";
    }



}
