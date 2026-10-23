public class compare {
    public static void main(String[] args) {
        String  str ="trisha";
        String str2="trisha";
        String str3=new String("trisha");

        if(str==str2){
System.out.println("are equal");
        }else{
            System.out.println("not equal");
        }
   if(str==str3){
System.out.println("are equal");
        }else{
            System.out.println("not equal");
        }
if(str.equals(str3)){
    System.out.println("equal");
}
    }
}
