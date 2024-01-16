package GameProcesses;

import Entities.Board;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static Entities.Board.printBoard;
import static Entities.Board.printBoardForEnemy;

public class Game {
    public void start(Board[][] board1, Board[][] board2){
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        Attack attack = new Attack();
        int defeatedOfBoard1 = 0;
        int defeatedOfBoard2 = 0;
        int whoStarts = random.nextInt(0,1);

        while(true){
            System.out.println("Player " + (whoStarts + 1) + " choose attacking positions ");

            if(whoStarts == 0){
                printBoardForEnemy(board2);
                int x = scan.nextInt();
                int y = scan.nextInt();
                while(attack.attackOn(x,y,board2)){
                    printBoardForEnemy(board2);
                    x = scan.nextInt();
                    y = scan.nextInt();
                    defeatedOfBoard2++;
                }
                printBoardForEnemy(board1);
                System.out.println("Ohh you missed, the turn goes to another player!");
            }
            else{

                printBoardForEnemy(board1);
                int x = scan.nextInt();
                int y = scan.nextInt();
                while(attack.attackOn(x,y,board2)){
                    printBoardForEnemy(board1);
                    x = scan.nextInt();
                    y = scan.nextInt();
                    defeatedOfBoard1++;
                }
                printBoardForEnemy(board1);
                System.out.println("Ohh you missed, the turn goes to another player!");
            }
            if(defeatedOfBoard1 == 20){
                System.out.println("Player 2 has won the game Congratz!!!!");
                return;
            }
            if(defeatedOfBoard2 == 20){
                System.out.println("Player 1 has won the game Congratz!!!!");
                return;
            }
            whoStarts = whoStarts ^ 1;

        }
    }
}
