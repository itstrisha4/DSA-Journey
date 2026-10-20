import java.util.*;
public class diagnal_sum {
    public static void dm(int num[][]){
int sum=0;
 for(int i=0;i<num.length;i++){
    for(int j=0;j<num.length;j++){
        if(i==j){
            sum=sum+num[i][j];
        }
        if(i+j==num.length-1){
            sum=sum+num[i][j];
        }
    }
   
    
 }
  System.out.println(sum);
    }
    public static void main(String args[]){
         int num[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }

        };
        dm(num);
    }

}
