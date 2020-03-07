package sekcja6;

public class Floor {
    // cw 33

    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getArea(){
        return width * length;
    }

}
