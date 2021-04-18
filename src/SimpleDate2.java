public class SimpleDate2 {
    private int year;
    private int month;
    private int day;

    public SimpleDate2(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return this.day + "." + this.month + "." + this.year;
    }

    public SimpleDate2 afterNumberOfDays(int days){
        SimpleDate2 s2 = new SimpleDate2(this.year,this.month,this.day);
        if(s2.getDay()+days<=30){
            s2.setDay(s2.getDay()+days);
            return s2;
        }

        if(s2.getMonth()==12){
            s2.setYear(s2.getYear()+1);
            s2.setMonth(1);
            s2.setDay(days-(30-s2.getDay()));
            return s2;
        }

        s2.setMonth(s2.getMonth()+1);
        s2.setDay(days-(30-s2.getDay()));
        return s2;
    }




}
