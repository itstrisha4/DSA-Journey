
import java.util.Collections;
import java.util.Arrays;
public  class inbuiltrevsande{
    public static void  printArr(Integer num[]){
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
    public static void main(String[] args) {
        Integer num[]={5,6,3,7,4,2,1};
        Arrays.sort(num,0,3,Collections.reverseOrder());
        printArr(num);
    }
}