package sekcja7;

public class HealthyBurger extends Hamburger {
    private String addition5;
    private double addition5Price;
    private String addition6;
    private double addition6Price;

    public HealthyBurger(String meatType, double meatPrice,
                         String addition1, double addition1Price,
                         String addition2, double addition2Price,
                         String addition3, double addition3Price,
                         String addition4, double addition4Price,
                         String addition5, double addition5Price,
                         String addition6, double addition6Price,
                         String name) {
        super("brown rye", 2.99, meatType, meatPrice, addition1, addition1Price, addition2,
                addition2Price, addition3, addition3Price, addition4, addition4Price, name);
        this.addition5 = addition5;
        this.addition5Price = addition5Price;
        this.addition6 = addition6;
        this.addition6Price = addition6Price;
    }

    @Override
    public double showBurger() {
        double totalPrice = 0;
        totalPrice+= super.showBurger();
        if (!addition5.isEmpty() && !addition5.equals("none") && addition5 != null) {
            System.out.println(addition5 + "; item price: "+ addition5Price);
            totalPrice+= addition5Price;
        }
        if (!addition6.isEmpty() && !addition6.equals("none") && addition6 != null) {
            System.out.println(addition6 + "; item price: " + addition6Price);
            totalPrice += addition6Price;
        }
        return totalPrice;
    }
}
