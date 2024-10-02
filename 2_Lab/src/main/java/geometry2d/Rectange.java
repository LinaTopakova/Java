package geometry2d;

public class Rectange implements Figure {
    int length;
    int width;

    public Rectange(int length,int width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() {
        return length * width;
    }
    @Override
    public double perimeter(){
        return 2 * (length + width);
    }

    @Override
    public String toString(){
        return "area rectange: " + this.area() + ", perimeter: " + this.perimeter();
    }
}
