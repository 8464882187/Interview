package oopsconcepts;

public class House {
    private String address;
    private int numberOfRooms;
    private static int area;

    public House(String address, int numberOfRooms, int area) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    public static void calculatePrice(int price){
        if(price>0){
            area*=price;
        }else{
            System.out.println("It's very demanding");
        }
    }

    public static void main(String[] args) {
        House h= new House("Bommanampadu",3,1000000);
        System.out.println(h.getAddress()+" "+h.getArea()+" "+h.getNumberOfRooms());
        h.setArea(13);
        calculatePrice(26000);
        System.out.println(area);
    }
}
