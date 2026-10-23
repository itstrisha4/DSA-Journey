public class stringcomp {
    public static void countthis(String str){
       
        for(char c =0;c<str.length();c++){
            char ch=str.charAt(c);
           Integer count=1;
            while(c+1<str.length() && ch==str.charAt(c+1)){
            count++;
            c++;
            }
           
            
        String sf=Character.toString(ch);
        if(count>1){
            System.out.print(sf +count);
        }
        else if(count==1){
            System.out.print(sf);
        }
    }
    }
    public static void main(String[] args) {
        String str="aaaabbbccccdd";
        countthis(str);
    }
}
