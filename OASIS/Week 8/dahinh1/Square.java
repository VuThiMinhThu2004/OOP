public class Square extends Rectangle {
    public Square() {}

    public Square(double size) {
        setWidth(size);
        setLength(size);
    }

    /**
     * An especially short bit of Javadoc.
     */
    public Square(double size, String color, boolean filled) {
        setWidth(size);
        setLength(size);
        setColor(color);
        setFilled(filled);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public double getPerimeter() {
        return 4 * getSide();
    }
    
    public String toString() {
        return ("Square[side=" + getSide() + ",color=" + getColor() 
                + ",filled=" + isFilled() + "]");
    }
}
