public class fun1 {
    public static void isEven(int n){
        boolean en=true ;
        if( n%2 != 0){
en=false;
        }
        if(en==true){
            System.out.println("is even");
        }
        else{
            System.out.println("not even");
        }

    }
    public static void main(String args[]){
        isEven(5);
    }
}
