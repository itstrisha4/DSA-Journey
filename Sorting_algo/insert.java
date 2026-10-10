public class insert {
public static void sort(int num[]){
    for(int i=1;i<num.length;i++){
       int key=num[i];
       int j=i-1;
     while(j>=0 && num[j]>key){

            
         


num[j+1]=num[j];

j--;
            } num[j+1]=key;
           

            }
        

    
    for(int k=0;k<num.length;k++){
            System.out.println(num[k]);
        }
}
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};
        sort(num);
    }
}
