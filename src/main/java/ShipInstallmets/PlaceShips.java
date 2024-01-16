package ShipInstallmets;

import Entities.Board;

import java.util.*;

public class PlaceShips {
    public boolean ShipPlacing(Board[][] board, int l){
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        ArrayList<Integer> X = new ArrayList<>();
        ArrayList<Integer> Y = new ArrayList<>();
        if((l==1 && s.length()!=3) || (l==2 && s.length()!=7) || (l==3 && s.length()!=11) || (l==4 && s.length()!=15)){
            System.out.println("Wrong format of input!");
            return false;
        }
//        System.out.println(board);
        for(int k = 0; k + 2 < s.length(); k+=4){
            int x = Character.getNumericValue(s.charAt(k));
            int y = Character.getNumericValue(s.charAt(k+2));
            if(x<0 || x>9 || y<0 || y>9){
                System.out.println("Position does not exits!");
                return false;
            }
            if(board[x][y]!=Board.EMPTY){
                System.out.println("the position of x:" + x + " and y:" + y + " is not empty try again!");
                return false;
            }
            else{
                X.add(x);
                Y.add(y);
            }
        }
        Collections.sort(X);
        Collections.sort(Y);
        for(int i = 1; i < X.size(); i++){
            if(X.get(i)-X.get(i-1) > 1){
                System.out.println("the positions are not correct try again!");
                return false;
            }
        }
        for(int i = 1; i < Y.size(); i++){
            if(Y.get(i)-Y.get(i-1) > 1){
                System.out.println("the positions are not correct try again!");
                return false;
            }
        }
        if((Y.get(Y.size() - 1) - Y.get(0) == 0 && X.get(X.size() - 1) - X.get(0) == 0) || (Y.get(Y.size() - 1) - Y.get(0) !=0 && X.get(X.size() - 1) - X.get(0) != 0) ){
            System.out.println("the positions are not correct try again!");
            return false;
        }
        for(int i = 0; i < X.size(); i++){
            board[X.get(i)][Y.get(i)] = Board.SHIP;
//            ArrayList<Integer> positions = new ArrayList<>();
//            positions.add(X.get(i));
//            positions.add(Y.get(i));
////            System.out.println(positions);
//            ship.add(positions);
        }
//        System.out.println(ship);
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(board[i][j] == Board.SHIP)continue;
                outer:
                for (int x = (i==0?0:-1); x <= (i==9?0:1); x++) {
                    for (int y = (j==0?0:-1); y <= (j==9?0:1); y++) {
                        if(x==0 && y==0)continue;
                        if (board[i+x][j+y] == Board.SHIP) {
                            board[i][j] = Board.HALO;
                            break outer;
                        }
                    }
                }
            }
        }
        return true;
    }
}
