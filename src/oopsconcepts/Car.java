package oopsconcepts;

public class Car {
    private String companyname;
    private String modelname;
    private int year;
    private int mileage;
    public Car(String companyname, String modelname, int year, int mileage) {
        this.companyname = companyname;
        this.modelname = modelname;
        this.year = year;
        this.mileage = mileage;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public static void main(String[] args) {
        Car c= new Car("Suzuki","KIA carnival",2024,18);
        System.out.println(c.getCompanyname());
        System.out.println(c.getModelname());
        System.out.println(c.getMileage());
        System.out.println(c.getYear());
        c.setMileage(28);
        System.out.println(c.getMileage());
    }
}
