public class bubble_sort{
public static void sort(int num[]){
    for(int i=0;i<num.length;i++){
      for(int j=0;j<num.length-1;j++){
        if(num[j]>num[j+1]){
        int temp=num[j];
        num[j]=num[j+1];
        num[j+1]=temp;
        
       
        } 
      
    
      }
    }
   for(int k=0;k<num.length;k++){
    System.out.println(num[k]);
   }
}

    public static void main(String[] args) {
        int num[]={2,3,1,4,6,8,5};
       sort(num);

    }
}