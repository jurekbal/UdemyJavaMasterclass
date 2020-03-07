package sekcja7;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String breadRollType, double breadRollPrice, String meatType, double meatPrice,
                        String name) {
        super(breadRollType, breadRollPrice, meatType, meatPrice, "chips", 5.99,
                "drinks", 4.99,
                "", 0.00, "", 0.00, name);
    }
}
