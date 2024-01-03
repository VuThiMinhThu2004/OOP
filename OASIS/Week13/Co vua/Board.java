import java.util.ArrayList;


public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<>();

    public Board() {}

    /**
     * Thu vu comment Javadoc.
     */
    public void addPiece(Piece p) {
        if (!validate(p.getCoordinatesX(), p.getCoordinatesY())) {
            throw new IllegalArgumentException("Invalid coordinates for piece: " + p);
        }
    
        if (!pieces.contains(p)) {
            pieces.add(p);
        }
    }

    /**
     * Thu vu comment Javadoc.
     */
    public boolean validate(int x, int y) {
        return x >= 1 && y >= 1 && x <= 8 && y <= 8;
    }

    /**
     * Thu vu comment Javadoc.
     */
    public void removeAt(int x, int y) {
        pieces.removeIf(piece -> piece.getCoordinatesX() == x 
                        && piece.getCoordinatesY() == y);
    }

    /**
     * Thu vu comment Javadoc.
     */
    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    /**
     * Thu vu comment Javadoc.
     */
    public void setPieces(ArrayList<Piece> p) {
        pieces = p;
    }
}
