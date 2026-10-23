public class fintouppercase {
    public static void firstupper(String str){
  StringBuilder sb=new StringBuilder("");
for(char ch=0;ch<str.length();ch++){
   char ig=str.charAt(ch);
   
   if(ch==0 || str.charAt(ch-1)==' '){
    sb.append(Character.toUpperCase(ig));
    }else{
        sb.append(ig);
    }
}System.out.println(sb);
}
    public static void main(String[] args) {
        String str="she is a baddie " ;
        firstupper(str);
    }
}
