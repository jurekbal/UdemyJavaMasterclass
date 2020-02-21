package sekcja6;

public class Main {
    public static void main(String[] args) {

        // cw 32
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

//        // cw 31
//         Wall wall = new Wall(5,4);
//         System.out.println("area= " + wall.getArea());
//
//         wall.setHeight(-1.5);
//         System.out.println("width= " + wall.getWidth());
//         System.out.println("height= " + wall.getHeight());
//         System.out.println("area= " + wall.getArea());

//        // Challenge L78
//        BankAccount bankaccount = new BankAccount();
//        bankaccount.setBallance(12000.0);
//        bankaccount.setCustomerName("Marian Banaś");
//        System.out.println("Initial ballance of " + bankaccount.getCustomerName() + ": "+ bankaccount.getBallance());
//        bankaccount.withdraw(12000);
//        System.out.println("Ballance after withdraw 12000: "+ bankaccount.getBallance());
//        bankaccount.deposit(2000);
//        System.out.println("Ballance after deposit 2000: "+ bankaccount.getBallance());
//
//        VipCustomer vipCustomer1 = new VipCustomer();
//        VipCustomer vipCustomer2 = new VipCustomer(10000.0, "anonymousfred@gmail.com");
//        VipCustomer vipCustomer3 = new VipCustomer("Bob Smith", 20000, "bob.smith@mail.com");
//        System.out.println(vipCustomer1.toString());
//        System.out.println(vipCustomer2.toString());
//        System.out.println(vipCustomer3.toString());


//        // cw 30
//        Person person = new Person();
//        person.setFirstName("");   // firstName is set to empty string
//        person.setLastName("");    // lastName is set to empty string
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");    // firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");    // lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());

//        // cw 29
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());
    }

}
