public class palindrome {
    public static void pal(int n){
        int rev=0;
        int orginal=n;
        while(n !=0){
           int  last =n%10;
             rev=(rev*10)+last;

            n=n/10;
            
            
        }
            if(orginal==rev){
System.out.println("palindrome");
            }
            else{
                System.out.println("not palindrome");
            }
        }
    
    public static void main(String args[]){
        pal(121);
    }
}
