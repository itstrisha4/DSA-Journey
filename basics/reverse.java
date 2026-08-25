import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
int  num=sc.nextInt();

while(num >0){
    int ld=num%10;
     System.out.println(ld);
     num=num/10;
   
}
    }
}
