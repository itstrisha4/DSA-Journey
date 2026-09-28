public class srpp {
    public static void main(String[] args) {
        //space
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
        
        //stars
        for(int j=1;j<=5;j++){
       System.out.print("*");
        }
        //space
        for(int j=i;j<=5-i;j++){
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
}
