public class binomi {
   
    public static int factn(int n){
         int facto=1;
        for(int i=1;i<=n;i++){
            facto=facto *i;
        }
        return facto;
    }
       
    public static int factr(int r){
         int factr=1;
        for(int i=1;i<=r;i++){
            factr=factr *i;
        }
        return factr;
    }
       
    public static int factnr(int n,int r){

         int factnrr=1;
        for(int i=1;i<=n-r;i++){
            factnrr=factnrr *i;
        }
        return factnrr;
    }
    public static int fun(int n,int r){
        int bc= factn(n)/(factr(r) *(factnr(n,r)));
return bc;
    }
    public static void main(String[] args) {
        System.out.println(fun(5,2));
    }
}
