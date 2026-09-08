public class decintobin {
    public static void  hi(int n){
        while(n != 0){
        int rem=n%2;
        System.out.print(rem);
        n=n/2;
        }
    }
    public static void main(String[] args) {
        hi(7);
    }
}
