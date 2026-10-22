public class h1{
    public static  void hw(int num[][]){
        int count=0;
        for(int i=0;i<num.length;i++){
for(int j=0;j<num[0].length;j++){

    if(num[i][j]==3){
count++;
    }
}
        }System.out.println(count);
    }
    public static void main(String[] args) {
        int num[][]={{1,2,3},
        {2,3,4}};
        hw(num);
    }
}