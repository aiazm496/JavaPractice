import java.util.ArrayList;

public class Room {
    private ArrayList<Person2> persons;

    public Room(){
        this.persons = new ArrayList<>();
    }

    public void add(Person2 p){
        this.persons.add(p);
    }

    public Person2 shortest(){
        if(this.persons.isEmpty()){
            return null;
        }
        Person2 shortest = this.persons.get(0);
        for(Person2 p : this.persons){
            if(p.getHeight()<shortest.getHeight()){
                shortest = p;
            }
        }
        return shortest;

    }

    //take shortestPerson out from arraylist
    public Person2 take(){
        if(this.persons.isEmpty()){
            return null;
        }
        Person2 shortest = this.shortest();
        this.persons.remove(shortest);
        return shortest;

    }

    public boolean isEmpty(){
        if(!(this.persons.isEmpty())){
            return false;
        }
        return true;
    }

    public ArrayList<Person2> getPersons(){
        return this.persons;
    }


}
