package geometry3d;
import exceptions.InvalidHeight;
import exceptions.InvalidRadiusValue;
import geometry2d.*;

public class Cylinder {
    Figure base;
    double height;

    public Cylinder(int radius, double height) throws InvalidHeight {

        try {
            this.base = new Circle(radius);
        } catch (InvalidRadiusValue in){
            System.out.println(in.getMessage());
        }
        if (height <= 0)
            throw new InvalidHeight("Invalid Height!!!");
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }

    public String toString(){
        return "volume: " + volume();
    }
}
