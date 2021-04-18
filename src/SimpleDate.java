//create an advancedays with input and increase days in new object so that old remains intact.

public class SimpleDate {
     private int day;
     private int month;
     private int year;

     public SimpleDate(int day, int month, int year){
         this.day = day;
         this.month = month;
         this.year = year;
     }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public SimpleDate afterNumberOfDays(int days){
         SimpleDate s1 = new SimpleDate(this.day, this.month,this.year); //creating new object to not change orig obj.
         if(s1.getDay() + days <=30){
             s1.setDay(s1.getDay() + days);
             return s1;
         }
         if(s1.getMonth() ==12){
             s1.setYear(s1.getYear()+1);
             s1.setMonth(1);
             s1.setDay(days - (30-s1.getDay()));
             return s1;
         }
         s1.setDay(days-(30-s1.getDay()));
         s1.setMonth(s1.getMonth()+1);
        return s1;
     }


     public boolean before(SimpleDate s){
         if(this.year <s.getYear()){
             return true;
         }
         if(this.year >s.getYear()){
             return false;
         }
         if(this.month < s.getMonth()){
             return true;
         }
         if(this.month >  s.getMonth()){
             return false;
         }

         if(this.day < s.getDay()){
             return true;
         }
         return false;
     }

     public String toString(){
         return this.day + "." + this.month + "." + this.year;
     }
}
