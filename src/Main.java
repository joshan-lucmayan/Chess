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
        Scanner scanner = new Scanner(System.in);
        int choice;
        String move;

        System.out.println("Welcome to Chess");
        System.out.println("1. White");
        System.out.println("2. Black");
        System.out.println("Before we start, please choose your color: ");
        choice = scanner.nextInt();
        scanner.nextLine();

        int moveCounterWhite = 0;
        int moveCounterBlack = 0;

        if (choice == 1) { // White
            boardPieces.setPlayersColor("White");
            System.out.println("Initializing the board...");

            while (true) {
                while (moveCounterWhite == moveCounterBlack) {
                    boardPieces.displayBoardPieces(false); // White bottom
                    System.out.println("Enter your move (e.g. e2e4): ");
                    move = scanner.nextLine();
                    boardPieces.moveThePiece(move);
                    moveCounterWhite++;
                }
                while (moveCounterBlack != moveCounterWhite) {
                    boardPieces.displayBoardPieces(true); // Black bottom
                    System.out.println("It's Black's turn!");
                    System.out.println("Enter your move (e.g. e7e5): ");
                    move = scanner.nextLine();
                    boardPieces.moveThePiece(move);
                    moveCounterBlack++;
                }
            }
        }
        else if (choice == 2) { // Black
            boardPieces.setPlayersColor("Black");
            System.out.println("Initializing the board...");

            while (true) {
                while (moveCounterWhite == moveCounterBlack) {
                    boardPieces.displayBoardPieces(true); // Black bottom
                    System.out.println("Enter your move (e.g. e7e5): ");
                    move = scanner.nextLine();
                    boardPieces.moveThePiece(move);
                    moveCounterWhite++;
                }
                while (moveCounterBlack != moveCounterWhite) {
                    boardPieces.displayBoardPieces(false); // White bottom
                    System.out.println("It's White's turn!");
                    System.out.println("Enter your move (e.g. e2e4): ");
                    move = scanner.nextLine();
                    boardPieces.moveThePiece(move);
                    moveCounterBlack++;
                }
            }
        }





    }
}
