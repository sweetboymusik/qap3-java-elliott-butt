public class Demo2 {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("orange", false);

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.2, "pink", false);

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(4.5, 5.5);

        Square square1 = new Square(1.7);
        Square square2 = new Square(3.4, "blue", true);

        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println(circle2);
        System.out.println(rectangle1);
        System.out.println(square2);

        System.out.println("circle1 area: " + circle1.getArea());
        System.out.println("circle1 perimiter: " + circle1.getPerimiter());

        System.out.println("rectangle2 area: " + rectangle2.getArea());
        System.out.println("rectangle2 perimiter: " + rectangle2.getPerimiter());

        System.out.println("square1 area: " + square1.getArea());
        System.out.println("square1 perimiter: " + square1.getPerimiter());
    }
}
