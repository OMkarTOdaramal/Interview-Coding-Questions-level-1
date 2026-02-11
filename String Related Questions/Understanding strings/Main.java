public class Main {

    public static void main(String[] args) {
        
        String literal1 = "Hello";
        String literal2 = "Hello";

        String obj1 = new String("Hello");
        String obj2 = new String("Hello");

        // == checks reference
        System.out.println(literal1==literal2);
        // equals() checks values
        System.out.println(literal1.equals(literal2));

        // == checks reference
        System.out.println(obj1==obj2);
        // equals() checks values
        System.out.println(obj1.equals(obj2));

        System.out.println(literal1==obj1);
        System.out.println(literal1==obj2);
    }

}
