public class PersonWithSimpleDateObjAsPara {
    private String name;
    private SimpleDate s;

    public PersonWithSimpleDateObjAsPara(String name, SimpleDate s){
        this.name = name;
        this.s = s;
    }

    public SimpleDate getS(){
        return this.s;
    }

    public boolean isOlder(PersonWithSimpleDateObjAsPara p){
        if(this.s.before(p.getS())){
            return true;
        }
        return false;
    }


    @Override
    public String toString(){
        return this.name + ", " + this.s;
    }

}
