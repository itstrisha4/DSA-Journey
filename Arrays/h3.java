public class h3 {
   
    public static void check(int price[]){

        int bp= Integer.MAX_VALUE;
        int mp=0;
        for(int i=0;i<price.length;i++){

        int sp=price[i];
        if(bp<sp){
            int profit= sp-bp;
            mp=Math.max(profit,mp);
        }
        else{
            bp=price[i];
        }
       
    } System.out.println(mp);

    }
    public static void main(String[] args) {
        int price[]={7,6,4,3,1};
       
        check(price);
       
    }


}
