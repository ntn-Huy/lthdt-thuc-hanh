package Buoi1.Bai121;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle[] shapes = {
            new Rectangle(3, 4), new Rectangle(5, 5), new Rectangle(4, 2)
        };

        for (Rectangle r : shapes) {
            System.out.println("S = " + r.area() + ", P = " + r.perimeter()
                    + ", vuong? " + r.isSquare());
        }
    }
}
