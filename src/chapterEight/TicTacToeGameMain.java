package chapterEight;

import java.security.SecureRandom;
import java.util.Scanner;

public class TicTacToeGameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        TicTacToeGame game = new TicTacToeGame();
        int numberOfPlays = 0;
        while (numberOfPlays <= 9) {
            System.out.println("Play your game");
            int playerPosition= scanner.nextInt();
            while (game.isPositionOccupied(playerPosition) || !game.isValidMove(playerPosition)){
                System.out.println("Oga, play again.. that was an invalid move");
                playerPosition= scanner.nextInt();
            }
            game.playerInput(playerPosition, Symbol.X);
            game.displayBoard();
            if (game.isAWinner(Symbol.X)){
                System.out.println("X wins");
                break;
            }
            if (game.boardIsFull()){
                System.out.println("No winner");
                break;
            }
            int computerPosition= 1 + secureRandom.nextInt(9);
            while (game.isPositionOccupied(computerPosition)){
                System.out.println("i played an invalid move, let me replay");
                computerPosition= 1 + secureRandom.nextInt(9);
            }
            game.playerInput(computerPosition, Symbol.O);
            game.displayBoard();
            if (game.isAWinner(Symbol.O)){
                System.out.println("O wins");
                break;
            }
            if (game.boardIsFull()){
                System.out.println("No winner");
                break;
            }
            numberOfPlays +=2;
            System.out.println(numberOfPlays);
        }
    }

}

