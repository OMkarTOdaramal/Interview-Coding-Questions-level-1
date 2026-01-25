// Take t numbers from user and check every number and print prime if its prime and print not-prime if not

import java.util.Scanner;

public class IsPrime2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // int count = 0;

        for(int i=1;i<=t;i++){

            int count = 0;
            int n = sc.nextInt();
            for(int j=1;j<=n;j++){

                if(n%j == 0){
                    count++;
                }
            }

            if(count==2){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
        }

        sc.close();
    }
    
}
