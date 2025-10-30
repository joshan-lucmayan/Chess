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
        String urMoves;

        printer.println("Welcome to Chess");
        printer.println("1. White");
        printer.println("2. Black");
        printer.print("Before we start, please choose your color: ");
        choice = scanner.nextInt();
        scanner.nextLine();

        if(choice == 1){
            boardPieces.setPlayersColor("White");
            printer.println("Initializing the board...");
            boardPieces.displayBoardPieces();
            printer.print("Enter your move (e.g Nf3 (Knight to F3)): ");
            urMoves = scanner.nextLine();
        }
        else if(choice == 2){
            boardPieces.setPlayersColor("Black");
            printer.println("Initializing the board...");
            boardPieces.displayBoardPieces();
            printer.print("Enter your move (e.g Nf3 (Knight to F3)): ");
            urMoves = scanner.nextLine();
        }


    }
}
