public class BoardPieces {
    private final Printer printer;
    private String playersColor;

    private final String[][] blackInitialPieces = {
            {"♖", "♘", "♗", "♕", "♔", "♗", "♘", "♖"},
            {"♙", "♙", "♙", "♙", "♙", "♙", "♙", "♙"},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {"♟", "♟", "♟", "♟", "♟", "♟", "♟", "♟"},
            {"♜", "♞", "♝", "♛", "♚", "♝", "♞", "♜"}
    };

    private final String[][] whiteInitialPieces = {
            {"♜", "♞", "♝", "♛", "♚", "♝", "♞", "♜"},
            {"♟", "♟", "♟", "♟", "♟", "♟", "♟", "♟"},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {"♙", "♙", "♙", "♙", "♙", "♙", "♙", "♙"},
            {"♖", "♘", "♗", "♕", "♔", "♗", "♘", "♖"},
    };

    public BoardPieces() {
        this.printer = new Printer();
    }

    //Player color setters
    public String getPlayersColor() {
        return playersColor;
    }

    public void setPlayersColor(String playersColor) {
        this.playersColor = playersColor;
    }

    //Move pieces by algebraic notation (e.g., "e2e4")
    public void moveThePiece(String move) {
        // move like "e2e4"
        if (move.length() != 4) {
            System.out.println("Invalid move notation. Use format like e2e4");
            return;
        }

        int fromRow = 8 - Character.getNumericValue(move.charAt(1)); // e2 -> row 6
        int fromCol = move.charAt(0) - 'a';                          // e -> 4
        int toRow = 8 - Character.getNumericValue(move.charAt(3));   // e4 -> row 4
        int toCol = move.charAt(2) - 'a';                            // e -> 4

        String[][] board = playersColor.equalsIgnoreCase(playersColor) ? whiteInitialPieces : blackInitialPieces;

        String piece = board[fromRow][fromCol];
        if (piece.equals(" ")) {
            System.out.println("No piece at " + move.substring(0, 2));
            return;
        }

        board[toRow][toCol] = piece;
        board[fromRow][fromCol] = " ";

        System.out.println("Moved " + piece + " from " + move.substring(0, 2) + " to " + move.substring(2, 4));
    }

    //Display live board
    public void displayBoardPieces() {
        if (playersColor.equalsIgnoreCase("Black")) {
            int numBoard = 1;
            for (int i = 0; i < 8; i++) {
                System.out.print(numBoard + " |");
                for (int j = 0; j < 8; j++) {
                    System.out.print(" " + blackInitialPieces[i][j] + " |");
                }
                printer.println("");
                numBoard++;
            }
            System.out.println("    a   b   c   d   e   f   g   h");
        } else { // White
            int numBoard = 8;
            for (int i = 0; i < 8; i++) {
                System.out.print(numBoard + " |");
                for (int j = 0; j < 8; j++) {
                    System.out.print(" " + whiteInitialPieces[i][j] + " |");
                }
                printer.println("");
                numBoard--;
            }
            System.out.println("    a   b   c   d   e   f   g   h");
        }
    }
}
