public class BoardPieces {
    private String[][] board;
    private String[][] pieces;
    private final Printer printer;

    BoardPieces(){
        this.printer = new Printer();
        this.pieces = new String[8][8];
        this.board = new String[8][8];
    }

    public void displayBoardPieces(){
        for(int i = 1; i <= 9; i++){
            if(i == 9){
                System.out.println("    h   g   f   e   d   c   b   a ");
                break;
            }
            System.out.print(i + " |");
            for(int j = 1; j <= 8; j++){
                System.out.print("   " + "|");
            }
            printer.println("");
        }
    }


    public void blackInitialPieces(){
        printer.println("1 | ♖ | ♘ | ♗ | ♔ | ♕ | ♗ | ♘ | ♖ |");
        printer.println("2 | ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | ♙ |");
        printer.println("3 |   |   |   |   |   |   |   |   |");
        printer.println("4 |   |   |   |   |   |   |   |   |");
        printer.println("5 |   |   |   |   |   |   |   |   |");
        printer.println("6 |   |   |   |   |   |   |   |   |");
        printer.println("7 | ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | ♟ |");
        printer.println("8 | ♜ | ♞ | ♝ | ♚ | ♛ | ♝ | ♞ | ♜ |");
        printer.println("    h   g   f   e   d   c   b   a ");
    }

    public void whiteInitialPieces(){
        printer.println("| ♜ | ♞ | ♝ | ♛ | ♚ | ♝ | ♞ | ♜ | 1");
        printer.println("| ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | ♟ | 2");
        printer.println("|   |   |   |   |   |   |   |   | 3");
        printer.println("|   |   |   |   |   |   |   |   | 4");
        printer.println("|   |   |   |   |   |   |   |   | 5");
        printer.println("|   |   |   |   |   |   |   |   | 6");
        printer.println("| ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | 7");
        printer.println("| ♖ | ♘ | ♗ | ♕ | ♔ | ♗ | ♘ | ♖ | 8");
        printer.println("  a   b   c   d   e   f   g   h ");
    }
}
