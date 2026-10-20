
import java.util.*;

public class spiral_matrix {
    public static void spmat(int num[][]) {
        int row = num.length;
        int col = num[0].length;
        int startrow = 0;
        int endrow = row - 1;
        int startcol = 0;
        int endcol = col - 1;
        while (startrow <= endrow && startcol <= endcol) {
            // top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(num[startrow][j]);
            }
            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(num[i][endcol]);
            }
            // down

            for (int j = endcol - 1; j >= startcol; j--) {
                System.out.print(num[endrow][j]);
            }
            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                System.out.print(num[i][startcol]);
            }

            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }

    public static void main(String args[]) {
        int num[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }

        };
        // int num[][]=new int[4][4];

        spmat(num);
    }
}
