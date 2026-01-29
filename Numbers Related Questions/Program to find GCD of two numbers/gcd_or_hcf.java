import java.util.Scanner;
public class gcd_or_hcf {
  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter two numbers: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    int n = 1;

    while(n!=0){
      n = num1%num2;
      if(n!=0){
        num1 = num2;
        num2 = n;
      }
    }
    System.out.println(num2);

    sc.close();
  }
}
