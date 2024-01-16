package ShipInstallmets;

import Entities.Board;

import java.util.ArrayList;
import java.util.List;

import static Entities.Board.printBoard;

public class InstallShips {
    public void start(Board[][] board1){
        PlaceShips a = new PlaceShips();

        //
        //Getting The Ships of the first Player
        //
        int i = 1;
        while(i > 0){
            System.out.println("""
                \s
                Put the coordinates of 4 squared ship (format: x,y;x,y;x,y;x,y):\s
                """);
            if(a.ShipPlacing(board1,4)){
                printBoard(board1);
                i--;
            }
        }
        i = 2;
        while(i > 0) {
            System.out.println("Put the coordinates of 3 squared ship (format: x,y;x,y;x,y): " + "\n");
            if(a.ShipPlacing(board1,3)){
                printBoard(board1);
                i--;
            }
        }

        i = 3;
        while(i > 0) {
            System.out.println("Put the coordinates of 2 squared ship (format: x,y;x,y;x,y): " + "\n");
            if(a.ShipPlacing(board1, 2)){
                printBoard(board1);
                i--;
            }
        }

        i = 4;
        while(i> 0) {
            System.out.println("Put the coordinates of 1 squared ship (format: x,y;x,y;x,y): " + "\n");
            if(a.ShipPlacing(board1, 1)){
                printBoard(board1);
                i--;
            }
        }
        printBoard(board1);
    }
}
