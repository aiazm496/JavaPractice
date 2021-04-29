public class SimpleDate3 {
    private int day;
    private int month;
    private int year;

    public SimpleDate3(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean before(SimpleDate3 s){
        if(this.year<s.year){
            return true;
        }
        if(this.year>s.year){
            return false;
        }
        if(this.month<s.month){
            return true;
        }
        if(this.month>s.month){
            return false;
        }
        if(this.day<s.day){
            return true;
        }
        return false;

    }

}
