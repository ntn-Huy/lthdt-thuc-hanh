package Bai1C;

import java.util.ArrayList;
import java.util.List;

public class Q5 {
    static class Point {
        final int x, y;
        Point(int x, int y) { this.x = x; this.y = y; }
        
        public boolean equals(Point other) {
            return other != null && x == other.x && y == other.y;
        }
    }

    public static void main(String[] args) {
        Point p = new Point(1, 2);
        Point q = new Point(1, 2);
        Object o = q;

        System.out.println(p.equals(q));
        System.out.println(p.equals(o));

        List<Point> list = new ArrayList<>();
        list.add(p);
        System.out.println(list.contains(q));
    }
}
