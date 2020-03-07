package sekcja6;

// Challenge L87
public class Vehicle {

    private String name;
    private double speed;

    public void move(double speed){
        this.speed = speed;
    }

    public double getSpeed(){
        return speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
