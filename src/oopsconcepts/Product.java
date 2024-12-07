package oopsconcepts;

public class Product {
    private String productName;
    private long productCode;
    private static double price;

    public Product(String productName, long productCode, double price) {
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getProductCode() {
        return productCode;
    }

    public void setProductCode(long productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public static void applyDiscount(double percentage){
        if(price > 0){
            price-=percentage;
        }else{
            System.out.println("There is no discount");
        }
    }

    public static void main(String[] args) {
        Product p = new Product("Laptop",12345678910l,50000);
        System.out.println(p.getProductName()+" "+p.getPrice()+" "+p.getProductCode());
        applyDiscount(40.30);
        System.out.println(price);
    }
}
