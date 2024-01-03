public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    public Piece() {
    }

    /**
     * Thu vu comment Javadoc.
     */
    public Piece(int x, int y) {
        coordinatesX = x;
        coordinatesY = y;
        color = "blackl";
    }

    /**
     * Thu vu comment Javadoc.
     */
    public Piece(int x, int y, String color) {
        coordinatesX = x;
        coordinatesY = y;
        this.color = color;
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int coordinatesX, int coordinatesY);

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public String getColor() {
        return color;
    }

    /**
     * Thu vu comment Javadoc.
     */
    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    /**
     * Thu vu comment Javadoc.
     */
    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    /**
     * Thu vu comment Javadoc.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Thu vu comment Javadoc.
     */
    public boolean checkPosition(Piece p) {
        return coordinatesX == p.coordinatesX 
            && coordinatesY == p.coordinatesY;
    }
}
