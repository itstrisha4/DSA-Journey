public class fact {
    public static void main(String[] args) {
        int n=4;
        
        int fact=1;
       while(n>1){
          fact=fact*(n);
        n--;
         
        }
        System.out.println(fact);
    }
}
