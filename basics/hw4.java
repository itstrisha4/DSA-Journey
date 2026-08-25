public class hw4 {
    public static void main(String[] args) {
        int year=2006;
        if(year%4==0){
if(year%100==0){
    if(year%400==0){
        System.out.println("is leap year");
    }else{
        System.out.println("not");
    }
}else{
    System.out.println("not");
}
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
