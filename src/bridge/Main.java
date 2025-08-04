package bridge;

public class Main {
    public static void main(String[] args) {
        Color red = new Red();
        Color blue = new Blue();
        Color green = new Green();

        Shape redCircle = new Circle(red);
        Shape blueSquare = new Square(blue);
        Shape greenCircle = new Circle(green);

        System.out.println(redCircle.draw());
        System.out.println(blueSquare.draw());
        System.out.println(greenCircle.draw());
    }
}