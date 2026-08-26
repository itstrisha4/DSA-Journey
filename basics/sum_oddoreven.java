
import java.util.*;
public class sum_oddoreven {
    public static void main(String args[]){
       int n = 1267893;

int sume=0;
int sumo=0;
while(n>0){
 int ld=n%10;
 if(ld % 2==0){
    sume += ld;
   
 }
 else{
   sumo +=ld;
 }
  n=n/10;
}
System.out.println(sume);
System.out.println(sumo);
}
}
