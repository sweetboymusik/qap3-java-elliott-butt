public class Point {
    // instance variables
    private float x;
    private float y;

    // contructors
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // getters and setters
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] xy = { getX(), getY() };
        return xy;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // methods
    @Override
    public String toString() {
        return String.format("(%f, %f)", this.x, this.y);
    }
}