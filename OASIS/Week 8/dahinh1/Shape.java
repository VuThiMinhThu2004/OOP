public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {}

    public Shape(boolean filled) {
        this.filled = filled;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return ("Shape[color=" + color + ",filled=" + filled + "]");
    }

    /**
     * An especially short bit of Javadoc.
     */
    public static void main(String[] args) {
    }
}
