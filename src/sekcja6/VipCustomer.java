package sekcja6;

public class VipCustomer {
    // Challenge L79

    private String name;
    private double creditLimit;
    private String customerEmail;

    public VipCustomer(String name, double creditLimit, String customerEmail){
        this.name = name;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }

    public VipCustomer(double creditLimit, String customerEmail){
        this("Anonymous", creditLimit, customerEmail);
    }

    public VipCustomer(){
        this("Anonymous", 0.0, "noone@nowhere.null");
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", customerEmail='" + customerEmail + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
