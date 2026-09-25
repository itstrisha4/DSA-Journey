public class hallowrec {
    public static void rec(int torow,int tocol){
 for(int i=1;i<=torow;i++){
            for(int j=1;j<=tocol;j++){
                if( i==1||torow==i||j==1||j==tocol){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        
    }
    
    public static void main(String[] args) {
       rec(4,5);
}
}