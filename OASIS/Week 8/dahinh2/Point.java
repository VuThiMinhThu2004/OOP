import java.text.DecimalFormat;
import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    public Point() {
    }

    /**
     * An especially short bit of Javadoc.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public double distance(Point newPoint) {
        double x = this.pointX - newPoint.getPointX();
        double y = this.pointY - newPoint.getPointY();
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    /**
     * An especially short bit of Javadoc.
     */
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point newP = (Point) o;
            if (newP.pointX == this.pointX && newP.pointY == this.pointY) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    /**
     * An especially short bit of Javadoc.
     */
    public String toString() {
        DecimalFormat r = new DecimalFormat("0.0");

        String x = r.format(pointX);
        String y = r.format(pointY);
    
        return ("(" + x + "," + y + ")");
    }
}
