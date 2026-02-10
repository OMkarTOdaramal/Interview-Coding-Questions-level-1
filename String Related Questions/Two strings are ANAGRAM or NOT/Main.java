import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean isAnagram(String str1,String str2){

        boolean status = true;

        if(str1.length() != str2.length())
            return false;
        else{
            // toCharArray() is the method of String class that converts string into char array
            char[] as1 = str1.toLowerCase().toCharArray();
            char[] as2 = str2.toLowerCase().toCharArray();
            // Arrays is an utility class that provides various methods
            Arrays.sort(as1);
            Arrays.sort(as2);
            status = Arrays.equals(as1, as2);
        }
        return status;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if(isAnagram(s1, s2))
            System.out.println("Anagram");
        else
            System.out.println("not Anagram");

        sc.close();
    }
    
}
