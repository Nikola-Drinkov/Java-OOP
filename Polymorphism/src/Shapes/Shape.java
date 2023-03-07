package Shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;

     abstract double calculatePerimeter();
     abstract double calculateArea();

    public Double getPerimeter() {
        return perimeter;
    }

    public Double getArea() {
        return area;
    }
}
