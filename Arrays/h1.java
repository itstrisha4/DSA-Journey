public class h1 {
    public static boolean check(int nums[]){
       // int count=0;
        //  int start=nums[0];
        //  int last=nums.length;
         
        for(int i=0;i<nums.length;i++){
for(int j=i+1;j<nums.length;j++){
 if(nums[i]==nums[j])
return true;

}
}return false;
    }
    public static void main(String[] args) {
       int nums[]={1,2,3,1};
System.out.println(        check(nums)
);    

}
}