
public class getbit {
    public static int getith(int num,int i){
        int bitmask=1<<i;
if((num & bitmask)==0){
    return 0;

}else{
    return 1;
}
    }
    public static void main(String[] args) {
        System.out.println(getith(10,2));
    }
}
