public class h1 {
    public static void low(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            char st=str.charAt(i);
            if(st=='a'|| st=='e'||st=='i'||st=='o'||st=='u'){
count++;
            }
        }System.out.println(count);
    }
    public static void main(String[] args) {
        String str="AEIOUaeiou";
        low(str);
    }
}
