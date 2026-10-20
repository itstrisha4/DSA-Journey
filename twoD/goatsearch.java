public class goatsearch {
    public static boolean goat(int num[][],int key){
        int m=num[0].length-1;
        int n=0;
   while( n<num.length && m>=0){ 
    if(num[n][m]==key){
        System.out.println(n+"and"+m);
        return true;
        
    }    
else if(key<num[n][m]){
m--;
}else{
   n++;
}

    }return false;
}
    public static void main(String[] args) {
         int num[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }

        };
        goat(num,14);
    }
}
