public class buyandstock {
    public static void profi(int price[]){
            

     
       int bp=Integer.MAX_VALUE;
       int mp=0;
       
        for(int i=0;i<price.length;i++){
            int sp=price[i];
       if(bp<sp){
int profit=sp-bp;//todays profit
mp=Math.max(mp,profit);
       }    else{
        bp=price[i];
       }
            }System.out.println(mp);
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        profi(price);
    }
}
