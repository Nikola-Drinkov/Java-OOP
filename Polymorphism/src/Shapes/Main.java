package Shapes;

public class Main {
    public static void main(String[] args) {

        Shape rect = new Rectangle(10.0,5.0);
        Shape circle = new Circle(10.0);
        System.out.println(rect.calculatePerimeter());
        System.out.println(rect.calculateArea());
        System.out.printf("%.2f%n",circle.calculatePerimeter());
        System.out.printf("%.2f",circle.calculateArea());
    }
}
