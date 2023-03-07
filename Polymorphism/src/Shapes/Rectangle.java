package Shapes;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double calculatePerimeter() {
        return 2*width+2*height;
    }

    @Override
    double calculateArea() {
        return width*height;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

}
