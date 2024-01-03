public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return ("Rectangle[width=" + width + ",length=" + length
                + ",color=" + getColor() + ",filled=" + isFilled() + "]");
    }
}
