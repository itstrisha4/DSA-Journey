
public class substring {
    public static void subhe(String sub,int si,int ei){
       
        for(int i=si;i<ei;i++){
System.out.println(sub.charAt(i));
        }
    }
    public static void main(String[] args) {
        String sub="helloworld";
       

        subhe(sub,0,4);

    }
}
