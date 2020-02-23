package sekcja6;

// Challenge L87
public class Car extends Vehicle {

    private String model;
    private int noOfWheels;
    private String typeOfGearbox; // automacic/manual
    private int currentGear;
    private String steeringDirection;

    public Car(String name, String model, int noOfWheels, String typeOfGearbox) {
        super(name);
        this.model = model;
        this.noOfWheels = noOfWheels;
        this.typeOfGearbox = typeOfGearbox;
        this.currentGear = 0;
        this.steeringDirection = "ahead";
    }

    public void steereng(String direction){
        switch (direction) {
            case "left" :{
                System.out.println("Steering left");
                steeringDirection = "left";
                break;
            }
            case "right" : {
                System.out.println("Steering right");
                steeringDirection = "right";
                break;
            }
            case "ahead" : {
                System.out.println("Steering straight ahead");
                steeringDirection = "ahead";
                break;
            }
            default: {
                System.out.println("Incorrect steering command: " + direction);
            }
        }
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" +
                "model='" + model + '\'' +
                ", noOfWheels=" + noOfWheels +
                ", typeOfGearbox='" + typeOfGearbox + '\'' +
                ", currentGear=" + currentGear +
                ", steeringDirection='" + steeringDirection + '\'' +
                '}';
    }
}
