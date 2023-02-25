package PointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }
    public boolean contains(Point point){
        int pointX = point.getX();
        int pointY = point.getY();
        return pointX>= bottomLeft.getX()&&pointX<= topRight.getX()&&
                pointY>= bottomLeft.getY()&&pointY<= topRight.getY();
    }
}
