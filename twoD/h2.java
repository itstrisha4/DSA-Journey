public class h2 {
    public static void mi(int num[][]){
        int n=num.length;
        int m=num[0].length-1;
        int sum=0;
        int secrow=1;
        int seccol=0;
for(int j=seccol;j<=m;j++){
    
        sum+=num[secrow][j];
    
}System.out.println(sum);
    }
    public static void main(String[] args) {
        int num[][]={ {1,4,9},{11,4,3},{2,2,3} };
        mi(num);
    }
}
