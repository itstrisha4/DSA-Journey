import java.util.*;

public class h3 {
    public static void mi(String str, String str1) {
        str=str.toLowerCase();
        str1=str1.toLowerCase();
        if (str.length() == str1.length()) {

            char strii[] = str.toCharArray();
            char str1ii[] = str1.toCharArray();

            Arrays.sort(strii);
             Arrays.sort(str1ii);
            if (Arrays.equals(strii,str1ii)) {
                System.out.println("ana");
            } else {
                System.out.println("not ana");
            }

        }else{
            System.out.println("not anna different length");
        }
    }

    public static void main(String[] args) {
        String str = "race";
        String str1 = "care";
        mi(str, str1);

    }
}
