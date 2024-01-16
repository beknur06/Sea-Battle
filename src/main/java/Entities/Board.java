package Entities;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public enum Board {
    SHIP,HALO,EMPTY,DEFEATED,ATTACKED;
    public static void fillBoard(Board[][] board, Board value) {
        for (Board[] row : board) {
            Arrays.fill(row, value);
        }
    }
    public static void printBoard(Board[][] board) {
        List<String> s = asList("#️⃣","0️","1️⃣","2️⃣","3️⃣","4️⃣","5️⃣","6️⃣","7️⃣","8️⃣","9️⃣");
        for(String k:s) System.out.print(k);
        System.out.print('\n');
        int j = 1;
        for (Board[] row : board) {
            System.out.print(s.get(j));
            j++;
            for (Board column : row){
                switch (column) {
                    case SHIP -> System.out.print("\uD83D\uDEE5️");
                    case HALO -> System.out.print("\uD83D\uDFE6");
                    case EMPTY -> System.out.print("⬜");
                    case DEFEATED -> System.out.print("💥");
                    case ATTACKED -> System.out.print("💢");
                }
            }
            System.out.print('\n');
        }
    }
    public static void printBoardForEnemy(Board[][] board) {
        List<String> s = asList("#️⃣","0️","1️⃣","2️⃣","3️⃣","4️⃣","5️⃣","6️⃣","7️⃣","8️⃣","9️⃣");
        for(String k:s) System.out.print(k);
        System.out.print('\n');
        int j = 1;
        for (Board[] row : board) {
            System.out.print(s.get(j));
            j++;
            for (Board column : row){
                switch (column) {
                    case SHIP -> System.out.print("⬜️");
                    case HALO -> System.out.print("⬜");
                    case EMPTY -> System.out.print("⬜");
                    case DEFEATED -> System.out.print("💥");
                    case ATTACKED -> System.out.print("💢");
                }
            }
            System.out.print('\n');
        }
    }
}
