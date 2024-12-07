package oopsconcepts;

public class Desktop {
    private String brand;
    private int processor;
    private static int ramsize;

    public Desktop(String brand, int processor, int ramsize) {
        this.brand = brand;
        this.processor = processor;
        this.ramsize = ramsize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProcessor() {
        return processor;
    }

    public void setProcessor(int processor) {
        this.processor = processor;
    }

    public int getRamsize() {
        return ramsize;
    }

    public void setRamsize(int ramsize) {
        this.ramsize = ramsize;
    }
    public static void upgradeRam(int additionalsize){
        if(additionalsize>0){
            ramsize+=additionalsize;
        }else{
            System.out.println("Out of storage/ memory");
        }
    }

    public static void main(String[] args) {
        Desktop d = new Desktop("Dell",8086,10);
        System.out.println(d.getBrand()+" "+d.getProcessor()+" "+d.getRamsize());
       upgradeRam(11);
        System.out.println(ramsize);

    }
}
