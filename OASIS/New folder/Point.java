public class Point {
    private double pointX;
    private double pointY;

    public Point() {
    }

    /**
     * Javadoc.
     */
    public Point(double x, double y) {
        pointX = x;
        pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    /**
     * Javadoc.
     */
    public void setPointX(double x) {
        pointX = x;
    }

    public double getPointY() {
        return pointY;
    }

    /**
     * Javadoc.
     */
    public void setPointY(double y) {
        pointY = y;
    }

    /**
     * Javadoc.
     */
    public double distance(Point other) {
        return Math.sqrt(Math.pow((pointX - other.getPointX()), 2) 
                       + Math.pow((pointY - other.getPointY()), 2));
    }
}
