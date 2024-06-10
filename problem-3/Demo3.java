import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(2.3f, 4.4f);

        MovablePoint mvPoint1 = new MovablePoint();
        MovablePoint mvPoint2 = new MovablePoint(1.1f, 0.6f);
        MovablePoint mvPoint3 = new MovablePoint(5f, 7f, 1.1f, 0.6f);

        System.out.println("point1: " + point1);
        System.out.println("point2: " + point2);
        System.out.println("mvPoint1: " + mvPoint1);
        System.out.println("mvPoint2: " + mvPoint2);
        System.out.println("mvPoint3: " + mvPoint3);

        point1.setX(1f);
        point1.setY(8.3f);
        point2.setXY(4.4f, 1.2f);

        System.out.println("point1 x: " + point1.getX());
        System.out.println("point2 xy: " + Arrays.toString(point2.getXY()));

        mvPoint1.setSpeed(3.3f, 3.3f);
        System.out.println("mvPoint1 speed: " + Arrays.toString(mvPoint1.getSpeed()));

        mvPoint3.move();
        System.out.println("mvPoint3: " + mvPoint3);
    }
}
