

public class maxsubarray {
     public static void pair(int number[]){

int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                int curr=0;
               for(int k=i;k<=j;k++){
                
curr =curr+number[k];
               }
               System.out.println(curr);
if(curr>maxsum){
    maxsum=curr;



               }
               
            }
        }
        System.out.println(" sum is"+maxsum);
    }

    public static void main(String[] args) {
            int number[]={1,-2,6,-1,3};
        pair(number);
    }

}