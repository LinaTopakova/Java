package geometry3d;
import geometry2d.*;

public class Cylinder {
    Figure base;
    double height;

    public Cylinder(Figure base, double height){
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }

    public String toString(){
        return base.toString();
    }
}
