public class bintod {

 public static void calcu(int n){
           int dec=0;
           int pow=0;
            while(n !=0){
                int last= n%10;
               
                dec=dec+(last * (int)Math.pow(2,pow));
                n=n/10;
                pow++;
            }
            System.out.println(dec);
        }
    public static void main(String args[]){
calcu(1000);
       
    }
}
