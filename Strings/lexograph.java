public class lexograph {

public static void larg(String fruits[]){
    String llargest =fruits[0];
    for(int i=1;i<fruits.length;i++){
        if(llargest.compareTo(fruits[i])<0){
            llargest=fruits[i];
        }
    }System.out.println(llargest);

}

    
    public static void main(String[] args) {
       
        String fruits[]={"apple","bannana","mango"};
        larg(fruits);
        
    }
}
