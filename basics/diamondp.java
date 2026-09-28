public class diamondp {
    public static void main(String[] args) {
        //space
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
        
        //star
        for(int j=1;j<=(2*i)-1;j++){
       System.out.print("*");
    }
        //space
         for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
         //space
        for(int i=4;i>=1;i--){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
        
        //star
        for(int j=1;j<=(2*i)-1;j++){
       System.out.print("*");
    }
        //space
         for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
