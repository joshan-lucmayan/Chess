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
        if (move.length() != 4) {
            System.out.println("Invalid move notation. Use format like e2e4");
            return;
        }

        char fromFile = move.charAt(0);
        int fromRank = Character.getNumericValue(move.charAt(1));
        char toFile = move.charAt(2);
        int toRank = Character.getNumericValue(move.charAt(3));

        int fromRow = 8 - fromRank;
        int fromCol = fromFile - 'a';
        int toRow = 8 - toRank;
        int toCol = toFile - 'a';

        String piece = board[fromRow][fromCol];
        if (piece.equals(" ")) {
            System.out.println("No piece at " + move.substring(0, 2));
            return;
        }

        boolean isWhitePiece = "♙♖♘♗♕♔".contains(piece);
        boolean isBlackPiece = "♟♜♞♝♛♚".contains(piece);

        // prevent moving opponent’s pieces
        if (playersColor.equalsIgnoreCase("White") && !isWhitePiece) {
            System.out.println("You can only move White pieces!");
            return;
        }
        if (playersColor.equalsIgnoreCase("Black") && !isBlackPiece) {
            System.out.println("You can only move Black pieces!");
            return;
        }

        board[toRow][toCol] = piece;
        board[fromRow][fromCol] = " ";

        System.out.println("Moved " + piece + " from " + move.substring(0, 2) + " to " + move.substring(2, 4));
    }






    //Display live board
    public void displayBoardPieces(boolean flipped) {
        if (flipped) { // black at bottom
            int numBoard = 1;
            for (int i = 7; i >= 0; i--) {
                System.out.print(numBoard + " |");
                for (int j = 7; j >= 0; j--) {
                    System.out.print(" " + board[i][j] + " |");
                }
                System.out.println();
                numBoard++;
            }
            System.out.println("    h   g   f   e   d   c   b   a");
        } else { // white at bottom
            int numBoard = 8;
            for (int i = 0; i < 8; i++) {
                System.out.print(numBoard + " |");
                for (int j = 0; j < 8; j++) {
                    System.out.print(" " + board[i][j] + " |");
                }
                System.out.println();
                numBoard--;
            }
            System.out.println("    a   b   c   d   e   f   g   h");
        }
    }





}
