public class Shape {
    // instance variables
    private String color;
    private boolean filled;

    // constructors
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // methods
    @Override
    public String toString() {
        String filled = "not filled";
        if (isFilled())
            filled = "filled";

        return String.format("A shape with color of %s and is %s", this.color, filled);
    }
}
