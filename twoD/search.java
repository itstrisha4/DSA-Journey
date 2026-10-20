public class search{
    public static void searchi(int num[][],int key){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
if(key==num[i][j]){
    System.out.println("at index"+i+" "+j+" ");       
}
            }
    }
    }
      public static void main(String args[]){
         int num[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }

        };
       
        searchi(num,7);
}
}