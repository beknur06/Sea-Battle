package GameProcesses;

import Entities.Board;

public class Attack {

    public boolean check(Board[][] board, int i, int j){
        for (int x = (i==0?0:-1); x <= (i==9?0:1); x++) {
            for (int y = (j==0?0:-1); y <= (j==9?0:1); y++) {
                if(x==0 && y==0)continue;
                if (board[i+x][j+y] == Board.SHIP) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean attackOn(int x, int y, Board[][] board){
        if(board[x][y] == Board.SHIP){
            board[x][y] = Board.DEFEATED;
            if(check(board,x,y)){
                System.out.println("Wow you struck out the whole ship, take another attack ;)");
            }
            else{
                System.out.println("Wow you hit the part of the ship, take another shot ;)");
            }
            return true;
        }
        else{
            board[x][y] = Board.ATTACKED;
            System.out.println("Oops.. you didn't hit any ship :(");
            return false;
        }
    }
}
