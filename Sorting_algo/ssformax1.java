public class ssformax1 {

    public static void sort(int num[]){
  
        for(int i=0;i<num.length-1;i++){
           int mi=i;
           for(int j=i+1;j<num.length;j++){

           
                if(num[j]>num[mi]){
                    
               mi=j;
                }
            
           }
                int t=num[mi];
               num[mi]=num[i];
                num[i]=t;
                
            
                
        } 
        for(int k=0;k<num.length;k++){
            System.out.println(num[k]);
        }
    }
    
    public static void main(String[] args) {
        int num[]={9,7,5,3,1};
        sort(num);
    }
}

