public class sumofdig {
    public static void sim(int a){
        int sum=0;
        if(a<0){
            a=-a;
        
        while(a  > 0){
            int last=a%10;
            
            sum=sum+last;
            a=a/10;
        }
        System.out.println(sum);
    }
}
    public static void main(String[] args) {
        sim(-1234);
    }
}
