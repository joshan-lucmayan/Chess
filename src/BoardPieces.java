public class BoardPieces {
    private final Printer printer;
    private String playersColor;

    private String[][] board = {
            {"♜", "♞", "♝", "♛", "♚", "♝", "♞", "♜"}, // 8
            {"♟", "♟", "♟", "♟", "♟", "♟", "♟", "♟"}, // 7
            {" ", " ", " ", " ", " ", " ", " ", " "}, // 6
            {" ", " ", " ", " ", " ", " ", " ", " "}, // 5
            {" ", " ", " ", " ", " ", " ", " ", " "}, // 4
            {" ", " ", " ", " ", " ", " ", " ", " "}, // 3
            {"♙", "♙", "♙", "♙", "♙", "♙", "♙", "♙"}, // 2
            {"♖", "♘", "♗", "♕", "♔", "♗", "♘", "♖"}  // 1
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
        // Expecting move format like "e2e4"
        if (move.length() != 4) {
            System.out.println("Invalid move notation. Use format like e2e4");
            return;
        }

        // Parse source and destination from algebraic notation
        char fromFile = move.charAt(0); // a–h
        int fromRank = Character.getNumericValue(move.charAt(1)); // 1–8
        char toFile = move.charAt(2);
        int toRank = Character.getNumericValue(move.charAt(3));

        // Adjust coordinates depending on player color
        int fromRow, fromCol, toRow, toCol;
        if (playersColor.equalsIgnoreCase("White")) {
            fromRow = 8 - fromRank;
            fromCol = fromFile - 'a';
            toRow = 8 - toRank;
            toCol = toFile - 'a';
        } else {
            // For Black, reverse the board coordinates
            fromRow = fromRank - 1;
            fromCol = 'h' - fromFile;
            toRow = toRank - 1;
            toCol = 'h' - toFile;
        }

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
            // Black sees the board flipped
            int rank = 1;
            for (int i = 7; i >= 0; i--) {
                System.out.print(rank + " |");
                for (int j = 7; j >= 0; j--) {
                    System.out.print(" " + board[i][j] + " |");
                }
                printer.println("");
                rank++;
            }
            System.out.println("    h   g   f   e   d   c   b   a");
        } else {
            // White sees the normal orientation
            int rank = 8;
            for (int i = 0; i < 8; i++) {
                System.out.print(rank + " |");
                for (int j = 0; j < 8; j++) {
                    System.out.print(" " + board[i][j] + " |");
                }
                printer.println("");
                rank--;
            }
            System.out.println("    a   b   c   d   e   f   g   h");
        }
    }


}
