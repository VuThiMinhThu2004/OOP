import java.text.DecimalFormat;

public class Triangle implements GeometricObject {
    private Point p1 = new Point(0, 0);
    private Point p2 = new Point(0, 0);
    private Point p3 = new Point(0, 0);

    /**
     * Javadoc.
     */
    public Triangle(Point p1, Point p2, Point p3)
            throws RuntimeException {
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p3.distance(p2);

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new RuntimeException();
        } else {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    /**
     * Javadoc.
     */
    public double getArea() {
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p3.distance(p2);

        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * Javadoc.
     */
    public double getPerimeter() {
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p3.distance(p2);

        return a + b + c;
    }

    /**
     * String formattedNumber = String.format("%.2f", input).
     */
    public String getInfo() {
        DecimalFormat df = new DecimalFormat("0.00");
        return ("Triangle[(" + df.format(p1.getPointX())
                + "," + df.format(p1.getPointY()) + "),("
                + df.format(p2.getPointX()) + "," + df.format(p2.getPointY()) + "),("
                + df.format(p3.getPointX()) + "," + df.format(p3.getPointY()) + ")]");
    }
}
