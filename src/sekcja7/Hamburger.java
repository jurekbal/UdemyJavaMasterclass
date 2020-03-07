package sekcja7;

// Bills Burger pricing module
// OOP Master Challenge lesson 96
public class Hamburger {
    private String breadRollType;
    private double breadRollPrice;
    private String meatType;
    private double meatPrice;
    private String addition1;
    private double addition1Price;
    private String addition2;
    private double addition2Price;
    private String addition3;
    private double addition3Price;
    private String addition4;
    private double addition4Price;
    private String name;

    public Hamburger(String breadRollType, double breadRollPrice, String meatType, double meatPrice,
                     String addition1, double addition1Price,
                     String addition2, double addition2Price,
                     String addition3, double addition3Price,
                     String addition4, double addition4Price,
                     String name) {
        this.breadRollType = breadRollType;
        this.breadRollPrice = breadRollPrice;
        this.meatType = meatType;
        this.meatPrice = meatPrice;
        this.addition1 = addition1;
        this.addition1Price = addition1Price;
        this.addition2 = addition2;
        this.addition2Price = addition2Price;
        this.addition3 = addition3;
        this.addition3Price = addition3Price;
        this.addition4 = addition4;
        this.addition4Price = addition4Price;
        this.name = name;
    }

    public double showBurger() {
        double totalPrice = 0;
        System.out.println("Name: "+ name);
        System.out.println("Bread roll type: " + breadRollType + "; item price: " + breadRollPrice);
        totalPrice+= breadRollPrice;
        System.out.println("Meat type: " + meatType + "; item price: " + meatPrice);
        totalPrice+= meatPrice;
        
        if (!addition1.isEmpty() && !addition1.equals("none") && addition1 != null) {
            System.out.println(addition1 + "; item price: "+ addition1Price);
            totalPrice+= addition1Price;
        }
        if (!addition2.isEmpty() && !addition2.equals("none") && addition2 != null) {
            System.out.println(addition2 + "; item price: "+ addition2Price);
            totalPrice+= addition2Price;
        }
        if (!addition3.isEmpty() && !addition3.equals("none") && addition3 != null) {
            System.out.println(addition3 + "; item price: "+ addition3Price);
            totalPrice+= addition3Price;
        }
        if (!addition4.isEmpty() && !addition4.equals("none") && addition4 != null) {
            System.out.println(addition4 + "; item price: "+ addition4Price);
            totalPrice+= addition4Price;
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        Hamburger hamburger1 = new Hamburger("standard bread", 0.99,
                "beef", 4.99, "lettuce", 1.99,
                "cheese", 2.99, "",0.00, "", 0.00,
                "Standard burger");
        System.out.println("Total: " + hamburger1.showBurger());

        HealthyBurger healthyBurger = new HealthyBurger("beef", 4.99,
                "lettice", 1.99, "cheese", 2.99,
                "carrot", 0.99, "tomato", 2.99,
                "radish", 1.50, "BBQ sauce", 2.00,
                "Healthy Burger");
        System.out.println("Total: " + healthyBurger.showBurger());

        DeluxeBurger deluxeBurger = new DeluxeBurger("extra smooth bread", 3.50,
                "beef", 4.99, "Deluxe burger set");
        System.out.println("Total: " + deluxeBurger.showBurger());
    }
}
