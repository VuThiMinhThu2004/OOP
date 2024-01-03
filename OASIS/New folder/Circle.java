import java.text.DecimalFormat;

public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center = new Point(0, 0);
    private double radius;

    /**
     * Javadoc.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    /**
     * Javadoc.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * Javadoc.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    /**
     * Javadoc.
     */
    public String getInfo() {
        DecimalFormat df = new DecimalFormat("0.00");
        return ("Circle[(" + df.format(center.getPointX())
                + "," + df.format(center.getPointY()) 
                + "),r=" + df.format(radius) + "]");
    }
}
