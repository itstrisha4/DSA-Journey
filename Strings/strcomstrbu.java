public class strcomstrbu {
    public static void count(String str){
StringBuilder sb=new StringBuilder(" ");
for(int c =0;c<str.length();c++){
    char ch=str.charAt(c);
   int count=1;
   while(c+1<str.length() && ch==str.charAt(c+1)){
count++;
c++;
   }
sb.append(ch);


   if(count>1){
    sb.append(count);
   }

}System.out.println(sb);
    }
    public static void main(String[] args) {
        String str="aaabbbcccdd";
        count(str);
    }
}
