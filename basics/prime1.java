public class prime1 {
    public static void main(String[] args) {
        int n=9;
        if(n== 2){
            System.out.println("prime");
        }
        else{
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){

if(n%i==0){
   isprime=false;
}
        }
        if(isprime==true){
System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
}