package web_day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Bingo {
    public static void main(String[] args) {
        Set set = new HashSet();
        int[][] board = new int[5][5];
        Random rand = new Random();

        for (int i = 0; set.size()<25; i++) {
            set.add(rand.nextInt(50)+1+"");
        }
        Iterator it = set.iterator(); // iterator를 거치면 오브젝트 타입이 된다

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j]=Integer.parseInt((String)it.next());
                System.out.printf("%4d ",board[i][j]);
            }
            System.out.println();
        }
    }
}
