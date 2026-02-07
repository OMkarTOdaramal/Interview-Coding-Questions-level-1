public class Main {

    public static String removeVowels(String str){

        String newStr = str.replaceAll("[AEIOUaeiou]", "");
        return newStr; 
    }

    public static void main(String[] args) {
        
        String str = "Hello, How are you?";
        System.out.println(removeVowels(str));
    }
    
}
