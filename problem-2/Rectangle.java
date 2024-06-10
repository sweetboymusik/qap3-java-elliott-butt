public class Rectangle extends Shape {
    // instance variables
    private double width;
    private double length;

    // constructors
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // getters and setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // methods
    public double getArea() {
        return width * length;
    }

    public double getPerimiter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "A rectangle with a width of " + this.width + " and a length of " + this.length
                + ", which is a subclass of " + super.toString();
    }
}