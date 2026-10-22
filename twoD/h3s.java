public class h3s {
public static void tran(int num[][]){
    for(int i=0;i<num.length;i++){
        for(int j=0;j<num[0].length;j++){
System.out.print(num[i][j]+ " ");
        }System.out.println();
    }
}
    public static void main(String[] args) {
        int row=2;
int col=3;
        int num[][]={{1,2,3},{7,8,9}};

         
         int tans[][]=new int[col][row];
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                tans[j][i]=num[i][j];
            }
         }
         tran(tans);
    }
}
