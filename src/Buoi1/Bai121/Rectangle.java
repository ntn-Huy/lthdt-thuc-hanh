package Buoi1.Bai121;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Kich thuoc phai duong");
        }
        this.width = width;
        this.height = height;
    }

    public double area() { return width * height; }
    public double perimeter() { return 2 * (width + height); }
    public boolean isSquare() { return Math.abs(width - height) < 1e-9; }
}
