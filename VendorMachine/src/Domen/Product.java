package Domen;

public class Product {
    private String name;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    private int price;
}
