public class bs{
    public static void bubble(int num[]){
        int n=num.length;
        
for(int i=0;i<n-1;i++){
  int   swap=0;
for(int j=0;j<n-1-i;j++){
     if(num[j]>num[j+1]){
        int temp=num[j];
        num[j]=num[j+1];
        num[j+1]=temp;
        
       swap++;
        } 
      
}
if(swap<0){
    System.out.println("already");
}
      
}

   for(int k=0;k<num.length;k++){
    System.out.println(num[k]);

}
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        bubble(num);
    }
    
}