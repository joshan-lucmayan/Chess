public class BoardPieces {
    private final Printer printer;
    private String playersColor;

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

    /*
        Testing purposes
         */
    /*
        Testing purposes
         */
    /*
        Testing purposes
         */
    /*
        Testing purposes
         */

    BoardPieces() {
        this.printer = new Printer();
    }

    //Set & Get Colors Player

    public String getPlayersColor(){
        return this.playersColor;
    }

    public void setPlayersColor(String playersColor){
        this.playersColor = playersColor;
    }

    //Players Moves

    public void moveThePiece(String playersColor){

    }

    //Display LIVE Board Pieces

    int numBoard = 1;
    public void displayBoardPieces(){
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
        Testing purposes
         */
    /*
        Testing purposes
         */
    /*
        Testing purposes
         */
    /*
        Testing purposes
         */

}
