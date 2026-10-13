
import java.util.Arrays;
public class inbuild2 {
   




    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 5, 1};

        Arrays.sort(arr);
        printArr(arr);
    }

 
}
