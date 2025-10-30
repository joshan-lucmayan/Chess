public class BoardPieces {
    private final Printer printer;

    private String[][] blackInitialPieces = {
            {"♖", "♘", "♗", "♔", "♕", "♗", "♘", "♖"}, //1
            {"♙", "♙", "♙", "♙", "♙", "♙", "♙", "♙"}, //2
            {" ", " ", " ", " ", " ", " ", " ", " "}, //3
            {" ", " ", " ", " ", " ", " ", " ", " "}, //4
            {" ", " ", " ", " ", " ", " ", " ", " "}, //5
            {" ", " ", " ", " ", " ", " ", " ", " "}, //6
            {"♟", "♟", "♟", "♟", "♟", "♟", "♟", "♟"}, //7
            {"♜", "♞", "♝", "♚", "♛", "♝", "♞", "♜"}  //8
    };

    private String[][] whiteInitialPieces = {
            {"♜", "♞", "♝", "♛", "♚", "♝", "♞", "♜"},
            {"♟", "♟", "♟", "♟", "♟", "♟", "♟", "♟"},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {"♙", "♙", "♙", "♙", "♙", "♙", "♙", "♙"},
            {"♖", "♘", "♗", "♕", "♔", "♗", "♘", "♖"},
    };

    BoardPieces() {
        this.printer = new Printer();
    }

    int numBoard = 1;
    public void displayBoardPieces(String playersColor){
        if(playersColor.equalsIgnoreCase("Black")){
            for(int i = 0; i < 8; i++){
                System.out.print(numBoard + " |");
                for(int j = 0; j < 8; j++){
                    System.out.print(" " + blackInitialPieces[i][j] + " " + "|");
                }
                printer.println("");
                numBoard++;
            }
            System.out.println("    h   g   f   e   d   c   b   a ");
        }
        else if(playersColor.equalsIgnoreCase("White")){
            numBoard = 8;
            for(int i = 0; i < 8; i++){
                System.out.print(numBoard + " |");
                for(int j = 0; j < 8; j++){
                    System.out.print(" " + whiteInitialPieces[i][j] + " " + "|");
                }
                printer.println("");
                numBoard--;
            }
            System.out.println("    a   b   c   d   e   f   g   h ");
        }
    }



    /*
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

     */
}
