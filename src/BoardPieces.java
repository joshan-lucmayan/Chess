public class BoardPieces {
    private final Printer printer;
    private String playersColor;

    private String[][] blackInitialPieces;
    private String[][] whiteInitialPieces;

    public BoardPieces() {
        this.printer = new Printer();
        Initializing();
    }

    public void Initializing(){
        whiteInitialPieces = new String[][]{
                {"♜", "♞", "♝", "♛", "♚", "♝", "♞", "♜"},
                {"♟", "♟", "♟", "♟", "♟", "♟", "♟", "♟"},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {"♙", "♙", "♙", "♙", "♙", "♙", "♙", "♙"},
                {"♖", "♘", "♗", "♕", "♔", "♗", "♘", "♖"},
        };

        blackInitialPieces = new String[][] {
                {"♖", "♘", "♗", "♕", "♔", "♗", "♘", "♖"},
                {"♙", "♙", "♙", "♙", "♙", "♙", "♙", "♙"},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {"♟", "♟", "♟", "♟", "♟", "♟", "♟", "♟"},
                {"♜", "♞", "♝", "♛", "♚", "♝", "♞", "♜"}
        };
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
            // Black sees their pieces at the bottom (flipped view)
            int rank = 1;
            for (int i = 7; i >= 0; i--) { // start from bottom row to top
                System.out.print(rank + " |");
                for (int j = 7; j >= 0; j--) { // reverse columns (h to a)
                    System.out.print(" " + blackInitialPieces[i][j] + " |");
                }
                printer.println("");
                rank++;
            }
            System.out.println("    h   g   f   e   d   c   b   a"); // flipped file labels
        } else {
            // White sees their pieces at the bottom (normal)
            int rank = 8;
            for (int i = 0; i < 8; i++) { // top to bottom
                System.out.print(rank + " |");
                for (int j = 0; j < 8; j++) { // normal left to right
                    System.out.print(" " + whiteInitialPieces[i][j] + " |");
                }
                printer.println("");
                rank--;
            }
            System.out.println("    a   b   c   d   e   f   g   h"); // normal file labels
        }
    }

}
