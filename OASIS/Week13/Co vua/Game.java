import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory = new ArrayList<>();

    /**
     * Initializes a new game with the given board.
     *
     * @param board The game board.
     */
    public Game(Board board) {
        this.board = board;
    }

    /**
     * Moves the specified piece to the given coordinates.
     * Updates the move history accordingly.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece != null) {
            if (piece.canMove(board, x, y) && board.getAt(x, y) == null) {
                Move move = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(), y, piece);
                moveHistory.add(move);
            } else if (piece.canMove(board, x, y) && board.getAt(x, y) != null) {
                Move move = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(),
                        y, piece, board.getAt(x, y));
                moveHistory.add(move);
                board.removeAt(x, y);
            }
            board.removeAt(piece.getCoordinatesX(), piece.getCoordinatesY());
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
            board.addPiece(piece);
        }
    }

    /**
     * Gets the game board.
     *
     * @return The game board.
     */
    public Board getBoard() {
        return board;
    }

    /**
     * Sets the game board.
     *
     * @param board The new game board.
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * Gets the move history.
     *
     * @return The move history.
     */
    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }
}
