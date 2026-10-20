import java.util.*;
public class spiral_matrix {
    public static void spmat(int num[][]){
        int row=num.length;
        int col=num[0].length;
        int startrow=0;
        int endrow=row-1;
        int startcol=0;
        int endcol=col-1;
        while(){
for(int i=startcol;i<=endcol;i++){
    System.out.println(num[i]);
}

        }
    }
    public static void main(String args[]){
        int num[][] = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
};
//int num[][]=new int[4][4];

spmat(num);
    }
}
