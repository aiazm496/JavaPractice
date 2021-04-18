public class Apartment {
    private int rooms;
    private int area;
    private int price;

    public Apartment(int rooms, int area, int price){
        this.rooms = rooms;
        this.area = area;
        this.price = price;
    }

    public int getArea() {
        return area;
    }

    public int getPrice() {
        return price;
    }

    public boolean isBigger(Apartment a){
        return this.getArea()>a.getArea();
    }

    public boolean isExpensive(Apartment a){
        return this.getPrice() > a.getPrice();
    }
}
