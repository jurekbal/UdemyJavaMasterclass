package sekcja6;

// challenge L87
public class FamilyCar extends Car {

    private String fuelType;
    private int seats;

    public void horn(){
        System.out.println("Beep beep");
    }

    public FamilyCar(String name, String model, int noOfWheels, String typeOfGearbox, String fuelType, int seats) {
        super(name, model, noOfWheels, typeOfGearbox);
        this.fuelType = fuelType;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return super.toString() +"FamilyCar{" +
                "fuelType='" + fuelType + '\'' +
                ", seats=" + seats +
                '}';
    }
}
