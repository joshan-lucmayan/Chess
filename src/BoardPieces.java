public class BoardPieces {
    Printer printer = new Printer();

    public void blackInitialPieces(){
        printer.println("1 | ♖ | ♘ | ♗ | ♔ | ♕ | ♗ | ♘ | ♖ |");//8
        printer.println("2 | ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | ♙ | ♙ |");//7
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
