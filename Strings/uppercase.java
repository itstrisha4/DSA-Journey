public class uppercase {
    public static void upc(String str){
        StringBuilder sb=new StringBuilder("");
for(char ch=0;ch<str.length();ch++){
   char ig=str.charAt(ch);
    sb.append(Character.toUpperCase(ig));
    
}System.out.println(sb);
    }
    public static void main(String[] args) {
        String str="this is beautigul day";
        upc(str);
    }
}
