public class kadansallneg {
    
public  static void pre(int number[]){
 int max=Integer.MIN_VALUE;
 
 int cs=0;
 for(int i=0;i<number.length;i++){
    cs=cs+number[i];
   
    if(cs>max){
        max=cs;
    
  }
 }System.out.println(max);

}
public static void main(String args[]){
 int number[]={-2,-3,-4,-5,-6};
 pre(number);
}
}