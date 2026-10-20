public class h4 {
    public static void rain(int height[]){
        
        int sum=0;
        //wl

        // //lb
int leftmax[]=new int[height.length];
leftmax[0]=height[0];
for(int i=1;i<height.length;i++){
    leftmax[i] = Math.max(height[i], leftmax[i-1]);

}
       

        //rb
        int rb[]=new int[height.length];
        rb[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
             rb[i]=Math.max(height[i],rb[i+1]);
        }

        //tp=wl-ht*wigth
        for(int i=0;i<height.length;i++){
            int width=1;
            int ht=height[i];
            int wl =Math.min(leftmax[i],rb[i]);
        int tp=(wl - ht )*width;
        
          sum =sum + tp;
        }
        System.out.println(sum);
        //sumtp
    }
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        rain(height);
    }
}
