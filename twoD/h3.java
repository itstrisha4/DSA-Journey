public class h3 {
    public static void tran(int num[][]){
int n=num.length;
int m=num[0].length;
for(int i=0;i<m;i++){
    for( int j=0;j<n;j++){
     System.out.print( num[j][i]+ " ");
    }System.out.println();
}
    }
    public static void main(String[] args) {
        int num[][]={ {1,4,9},{11,4,3} };
        tran(num);
    }
}
