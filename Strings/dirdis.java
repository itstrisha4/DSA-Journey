public class dirdis {
    public static void dir(String str){
      int x=0;
      int y=0;  



for(int i=0;i<str.length();i++){
  char dir= str.charAt(i);
  if(dir == 'S'){
 y=y-1;
  }
 else if(dir=='N'){
    y=y+1;
  }
 else if(dir=='E'){
    x=x+1;
  }
   else if(dir=='W'){
x=x-1;
  }
}

    double dis=Math.sqrt(x*x+y*y);
    System.out.println(dis);



    
}
    public static void main(String[] args) {
        String str="WNEENESENNN";
        dir(str);
    }
}
