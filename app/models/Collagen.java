package models;

/**
 * Created by Windows User on 18/7/2561.
 */
public class Collagen {
    private String id;
    private String name;
    private String brand;
    private String number;
    private double price;

    public Collagen () {
    }
    public Collagen(String id, String name, String brand, String number, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.number = number;
        this.price = price;
    }
    public String getId(){return id;}

    public void setId(String id){ this.id=id; }

    public String getName(){return name;}

    public void setName(String name){ this.name=name; }

    public String getBrand(){return brand;}

    public void setBrand(String brand){ this.brand=brand;}

    public String getNumber(){return number;}

    public void setNumber(String number){ this.number=number;}

    public double getPrice(){return price;}

    public void setPrice(Double price){ this.price=price;}
}
