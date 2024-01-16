import Entities.Board;
import GameProcesses.Game;
import ShipInstallmets.InstallShips;
import ShipInstallmets.PlaceShips;

import java.util.ArrayList;
import java.util.List;

import static Entities.Board.*;

public class Main {
    public static void main(String[] args) {

        PlaceShips a = new PlaceShips();
        InstallShips installShips = new InstallShips();
        Game game = new Game();

        //Set-Up Boards and fill with empty spaces;
        Board[][] board1 = new Board[10][10];
        Board[][] board2 = new Board[10][10];
        /*
        ArrayList<ArrayList<Integer>> fourLengthShip1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> threeLengthShip1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> twoLengthShip1 = new ArrayList<>();

        ArrayList<ArrayList<Integer>> fourLengthShip2 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> threeLengthShip2 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> twoLengthShip2 = new ArrayList<>();
*/
        fillBoard(board1, Board.EMPTY);
        fillBoard(board2, Board.EMPTY);
        System.out.println("Player 1:");
        installShips.start(board1);
        System.out.println("\n Clear the screen");


        System.out.println("Player 2:");
        installShips.start(board2);


        printBoard(board1);
        System.out.println("\n");
        printBoard(board2);

        game.start(board1,board2);

    }
}

