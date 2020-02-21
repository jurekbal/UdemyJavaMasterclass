package sekcja6;

public class BankAccount {
    // Challenge z lekcji 78

    private String accountNumber;
    private double ballance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBallance() {
        return ballance;
    }

    public void setBallance(double ballance) {
        this.ballance = ballance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void deposit(double funds){
        this.ballance+= funds;
    }

    public boolean withdraw(double funds){
        if (this.ballance >= funds) {
            setBallance(getBallance() - funds);
            return true;
        }
        System.out.println("Insufficient founds. Withdraw cancelled.");
        return false;
    }
}
