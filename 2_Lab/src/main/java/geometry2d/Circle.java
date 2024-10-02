package geometry2d;

public class Circle implements Figure {
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
    @Override
    public double perimeter(){
        return 2 * 3.14 * radius;
    }
    @Override
    public String toString(){
        return "area circle: " + this.area() + ", perimeter: " + this.perimeter();
    }
}
