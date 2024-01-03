public class ChessGameSimulation {
    /**
     * Thu vu comment Javadoc.
     */
    public static void main(String[] args) {
        // Initialize the chessboard
        Board chessBoard = new Board();
        initializeChessboard(chessBoard);

        // Create a new chess game with the initialized board
        Game chessGame = new Game(chessBoard);

        // Simulate a sequence of moves
        simulateMoves(chessGame);

        // Print the final state of the board
        System.out.println("Final state of the chessboard:");
        System.out.println(chessBoard.toString());

        // Print the move history
        System.out.println("Move history:");
        for (Move move : chessGame.getMoveHistory()) {
            System.out.println(move.toString());
        }
    }

    private static void initializeChessboard(Board chessBoard) {
         chessBoard.addPiece(new Rook(1, 1, "white"));
    }

    private static void simulateMoves(Game chessGame) {
        // Simulate a sequence of moves for demonstration purposes
        // Replace this with your actual game logic

        // Example: White moves Rook from a1 to a4
        chessGame.movePiece(chessGame.getBoard().getAt(1, 1), 1, 4);

        // Example: Black moves Pawn from b7 to b5
        chessGame.movePiece(chessGame.getBoard().getAt(2, 7), 2, 5);

    }
}
