public class Circle {
    private double radius;
    private String color;
    protected static final double PI = 3.14;

    public Circle() {}

    /**
     * an especially short bit of Javadoc.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * an especially short bit of Javadoc.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * an especially short bit of Javadoc.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    /**
     * an especially short bit of Javadoc.
     */
    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public String toString() {
        return ("Circle[radius=" + radius + "," + "color=" + color + "]");
    }
}