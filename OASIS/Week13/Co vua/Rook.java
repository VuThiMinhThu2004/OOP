import java.util.Objects;

public class Rook extends Piece {
    public Rook(int x, int y) {
        super(x, y);
    }

    public Rook(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        int xx = getCoordinatesX();
        int yy = getCoordinatesY();

        if (xx == x && yy == y) {
            return true;
        }

        if (xx == x || yy == y) {
            int start;
            int end;
            int step;

            if (xx == x) {
                start = Math.min(yy, y) + 1;
                end = Math.max(yy, y);
                step = 1;
            } else {
                start = Math.min(xx, x) + 1;
                end = Math.max(xx, x);
                step = 1;
            }

            for (int i = start; i < end; i += step) {
                if (board.getAt(xx == x ? xx : i, yy == y ? yy : i) != null) {
                    return false;
                }
            }

            return board.getAt(x, y) == null
                    || !Objects.equals(board.getAt(x, y).getColor(), getColor());
        }

        return false;
    }
}