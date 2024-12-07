package oopsconcepts;
public class SmartPhone {
    private String brand;
    private String model;
    private static int storageCapacity;
    public SmartPhone(String brand, String model, int storageCapacity) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getStorageCapacity() {
        return storageCapacity;
    }
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    public  static void increaseStorage(int additionalStorage){
        if(additionalStorage>0){
            storageCapacity+=additionalStorage;
        }else{
            System.out.println("there is no capacity to store");
        }
    }
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("1+","nord ce3 lite",8);
        System.out.println(sp.getBrand());
        System.out.println(sp.getModel());
        System.out.println(sp.getStorageCapacity());
        increaseStorage(10);
        System.out.println(storageCapacity);

    }
}
