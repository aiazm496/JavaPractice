import java.util.ArrayList;

public class Menu {
    private ArrayList<String> MenuList;

    public Menu(){
        this.MenuList = new ArrayList<>();
    }

    public void add(String meal){
        this.MenuList.add(meal);
    }

   public void printMeals(){
        for(String s : this.MenuList){
            System.out.println(s);
        }
   }

   public String toString(){
        String meals  = "";
        for(String s : this.MenuList){
            meals = meals + s + "\n";
        }
        return meals;
   }

   //clear menu

    public void clear(){
        this.MenuList.clear();
    }


}
