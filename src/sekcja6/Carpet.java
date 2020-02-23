package sekcja6;

public class Carpet {
    // cw 33
    private double cost;

    public Carpet(double cost){
        this.cost = (cost < 0) ? 0 : cost;
    }

    public double getCost(){
        return cost;
    }
}
