public class Cylinder extends Circle {
    private double height;

    public Cylinder() {}

    /**
     * an especially short bit of Javadoc.
     */
    public Cylinder(double height) {
        this.height = height;
    }

    /**
     * an especially short bit of Javadoc.
     */
    public Cylinder(double height, double radius) {
        this.height = height;
        super.setRadius(radius);
    }

    /**
     * an especially short bit of Javadoc.
     */
    public Cylinder(double height, double radius, String color) {
        this.height = height;
        super.setRadius(radius);
        super.setColor(color);
    }

    public double getHeight() {
        return height;
    }

    /**
     * an especially short bit of Javadoc.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * super.getArea();
    }

    public String toString() {
        return ("Cylinder[" + super.toString() + ",height=" + height + "]");
    }

    @Override
    public double getArea() {
        return 2 * PI * getRadius() * height + 2 * super.getArea();
    }
}
