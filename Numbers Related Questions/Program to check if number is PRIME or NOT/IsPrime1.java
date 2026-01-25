// Take number n from user and check number and print prime if its prime and print not-prime if not

import java.util.Scanner;

public class IsPrime1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for(int div=1;div<=n;div++){

            if(n%div == 0){
                count++;
            }
        }

        // prime Number -> Number must divide by 1 and itself means count should equals to 2 not more not less to be prime for number
        if(count == 2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }

        sc.close();

    }
    
}
