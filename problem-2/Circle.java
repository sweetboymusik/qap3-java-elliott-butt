public class Circle extends Shape {
    // instance fariables
    private double radius;

    // constructors
    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // methods
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public double getPerimiter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A circle with a radius of " + this.radius + ", which is a subclass of " + super.toString();
    }
}
