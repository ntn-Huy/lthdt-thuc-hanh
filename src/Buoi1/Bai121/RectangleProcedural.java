package Bai121;

public class RectangleProcedural {
    static double area(double w, double h) { return w * h; }
    static double perimeter(double w, double h) { return 2 * (w + h); }

    public static void main(String[] args) {
        double[] widths = {3, 5, 4};
        double[] heights = {4, 5, 2};

        for (int i = 0; i < widths.length; i++) {
            System.out.println("HCN " + i + ": S = " + area(widths[i], heights[i])
                    + ", P = " + perimeter(widths[i], heights[i]));
        }
        widths[0] = 10;
    }
}
