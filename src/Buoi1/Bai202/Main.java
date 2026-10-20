package Bai202;

public class Main {
    static void moveRight(Point p) {
        p.x = p.x + 10;
        p = new Point(0, 0);
        p.y = 999;
    }

    public static void main(String[] args) {
        Point a = new Point(1, 2);
        Point b = a;
        Point c = new Point(1, 2);

        b.y = 50;
        System.out.println(a.show() + " " + b.show() + " " + c.show());
        System.out.println((a == b) + " " + (a == c));

        moveRight(a);
        System.out.println(a.show());

        c = a;
        b = null;
        System.out.println(c.show());
    }
}
