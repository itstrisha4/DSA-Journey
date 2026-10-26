

public class set {
    
      public static int setith(int num,int i){
      int bitmask=1<<i;

    return num | bitmask;


    }
    public static void main(String[] args) {
        System.out.println(setith(10,2));
    }
    
}
