public class countsort {
    public static void count(int num[]){
      //largest 
      int large=Integer.MIN_VALUE;
for(int i=0;i<num.length;i++){
   large=Math.max(large,num[i]);
    
}
//counting
     int count[]= new int[large+1];
for(int j=0;j<num.length;j++){
count[num[j]]++;
}
  //sort
  int k=0;
  for(int i=0;i<count.length;i++){
  while(count[i]>0){
   num[k]=i;
   k++;
   count[i]--;
  }
}
for(int m =0;m<num.length;m++){
    System.out.println(num[m]);
}

    
} 

    public static void main(String[] args) {
        int num[]={1,4,1,3,2,4,3,7};
        count(num);
    }

}