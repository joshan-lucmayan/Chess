import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        The chess will be a console
        i will do ascii art for pieces and when the opponent move
        he will enter the notation of moves (e.g NF4 (Knight F4))
        That's all
         */

        //Var
        //Ascii  art piece
        //Input
        //LOGIC
        //Result


        BoardPieces boardPieces = new BoardPieces();
        Printer printer = new Printer();
        Scanner scanner = new Scanner(System.in);
        int choice;
        String move;

        printer.println("Welcome to Chess");
        printer.println("1. White");
        printer.println("2. Black");
        printer.print("Before we start, please choose your color: ");
        choice = scanner.nextInt();
        scanner.nextLine();

        int moveCounterWhite = 0;
        int moveCounterBlack = 0;

        if (choice == 1) {
            boardPieces.setPlayersColor("White");
            printer.println("Initializing the board...");

            while (true) {
                // White's turn
                while (moveCounterWhite == moveCounterBlack) {
                    boardPieces.displayBoardPieces(); // White at bottom
                    printer.println("It's White's turn!");
                    printer.print("Enter your move (e.g. e2e4): ");
                    move = scanner.nextLine();
                    boardPieces.moveThePiece(move);
                    moveCounterWhite++;
                }

                // Black's turn
                while (moveCounterBlack != moveCounterWhite) {
                    boardPieces.displayBoardPieces(); // same board orientation
                    printer.println("It's Black's turn!");
                    printer.print("Enter your move (e.g. e7e5): ");
                    move = scanner.nextLine();
                    boardPieces.moveThePiece(move);
                    moveCounterBlack++;
                }
            }

        } else if (choice == 2) {
            boardPieces.setPlayersColor("Black");
            printer.println("Initializing the board...");

            while (true) {
                // Black's turn first (since player is black)
                while (moveCounterWhite == moveCounterBlack) {
                    boardPieces.displayBoardPieces(); // Black at bottom (auto handled)
                    printer.println("It's Black's turn!");
                    printer.print("Enter your move (e.g. e7e5): ");
                    move = scanner.nextLine();
                    boardPieces.moveThePiece(move);
                    moveCounterBlack++;
                }

                // White's turn
                while (moveCounterBlack != moveCounterWhite) {
                    boardPieces.displayBoardPieces(); // stays flipped for black player
                    printer.println("It's White's turn!");
                    printer.print("Enter your move (e.g. e2e4): ");
                    move = scanner.nextLine();
                    boardPieces.moveThePiece(move);
                    moveCounterWhite++;
                }
            }
        }




    }
}
