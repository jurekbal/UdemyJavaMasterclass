package sekcja7;

// Polymorphism challenge - lesson 95
public class Car {
    private boolean hasEngine;
    private int numberOfWheels;
    private int numberOfCylinders;
    private boolean engineRuns;
    private int speed;
    private String name;

    public Car(int numberOfCylinders, String name) {
        this.hasEngine = true;
        this.numberOfWheels = 4;
        this.numberOfCylinders = numberOfCylinders;
        this.name = name;
        this.speed = 0;
        this.engineRuns = false;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public boolean isEngineRuns() {
        return engineRuns;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEngineRuns(boolean engineRuns) {
        this.engineRuns = engineRuns;
    }

    public void startEngine(){
        this.engineRuns = true;
        System.out.println("Engine started.");
    }

    public void stopEngine(){
        this.engineRuns = false;
        System.out.println("Engine stopped.");
    }

    public void accelerate(int speedAccelerate){
        this.speed+= speedAccelerate;
        System.out.println("Current speed: " + this.speed);
    }

    public void emergencyStop(){
        this.speed = 0;
        System.out.println("Emergency stop.");
    }


    public static void main(String[] args) {
        Porsche porsche = new Porsche(6, "Carrera", true);
        Tesla tesla = new Tesla("model S", 100);

        porsche.startEngine();
        porsche.accelerate(150);
        porsche.accelerate(150);
        porsche.emergencyStop();
        porsche.stopEngine();

        tesla.startEngine();
        tesla.accelerate(120);
        System.out.println("Current speed of Tesla: " + tesla.getSpeed());
        tesla.emergencyStop();
        tesla.stopEngine();
    }
}

class Porsche extends Car {
    private int maxSpeed;
    private boolean hasSpoiler;

    public Porsche(int numberOfCylinders, String name, boolean hasSpoiler) {
        super(numberOfCylinders, name);
        this.hasSpoiler = hasSpoiler;
        this.maxSpeed = 280;
    }

    @Override
    public void accelerate(int speedAccelerate) {
        if (this.getSpeed() + speedAccelerate > this.maxSpeed) {
            System.out.println("Max speed reached: " + this.maxSpeed);
            this.setSpeed(maxSpeed);
        } else {
            super.accelerate(speedAccelerate);
        }
    }
}

class Tesla extends Car {
    private int batteryLevel;

    public Tesla(String name, int batteryLevel) {
        super(0, name);
        if (batteryLevel > 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            this.batteryLevel = 100;
        }
        super.setEngineRuns(true);
    }

    @Override
    public void startEngine() {
        System.out.println("Electrical engine. No need to start.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Electrical engine. No need to stop.");
    }
}

