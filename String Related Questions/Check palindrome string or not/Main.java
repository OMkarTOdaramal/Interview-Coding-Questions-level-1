public class Main {
    
    public static void main(String[] args) {
        
        String str = "Madam";
        String rev = "";

        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }

        System.out.println(str == rev);
        System.out.println(str.equals(rev));
        // Remember JAVA is case sensitive
        System.out.println(str.equalsIgnoreCase(rev));

        if(str.equalsIgnoreCase(rev))
            System.out.println("String is Palindrome");
        else
            System.out.println("Not palindrome");
    }
}

