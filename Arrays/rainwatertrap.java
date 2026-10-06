public class rainwatertrap {
  

    
    public static  void rain( int height[]){
        //left
int leftmax[]=new int[height.length];
leftmax[0]=height[0];

 for(int i=1;i<height.length;i++){
    leftmax[i]=Math.max(height[i],leftmax[i-1]);
 }


 //right

  int rightmax[]=new int[height.length];
  rightmax[height.length-1]=height[height.length-1];
  for(int i=height.length-2;i>=0;i--){
    rightmax[i]=Math.max(height[i],rightmax[i+1]);
  }


  //waterlevel
  
        int tw=0;
         int sum =0;

 for(int i=0;i<height.length;i++){
    int wt= Math.min(leftmax[i],rightmax[i]);
    int width=1;

    tw= ( wt - height[i] )*  width ;
   if(tw<0){
    tw=0;
   }
 
 sum=sum+tw;
}
System.out.println(sum);
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
     rain(height);
    }
}
