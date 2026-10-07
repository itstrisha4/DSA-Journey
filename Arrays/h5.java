public class h5 {
    public static void check(int numb[]){
        for(int i=0;i<numb.length;i++){
for(int j=i+1;j<numb.length;j++){
    for(int k=j+1;k<numb.length;k++){
        if(i !=j && j!=k && i!=k){
            int num1=numb[i];
            int num2=numb[j];
            int num3=numb[k];
            int sum=num1+num2+num3;
             
            if(sum==0){
                System.out.println("{"+num1+","+num2+","+num3+"}");
            }
        }
    }
}
        }
    }
    public static void main(String[] args) {
       int numb[]={-1,-1,0,2,-4,1};
       check(numb);
    }
}
