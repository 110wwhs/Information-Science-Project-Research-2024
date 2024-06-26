package Shape;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    public double getPerimeter() {
//        return 2 * Math.PI * radius;
//    }
}
