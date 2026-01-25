import java.util.Scanner;

public class IsPrime3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        /* Prime - If number is divide by 1 and itself only then its prime */

        /* Not Prime - Remember if a number is not divided by less than the square root of a number then 
        that number will never get divide by further numbers means it will not prime*/
        // Example - 5 (1*5,5*5,5*1), 7 (1*7,7*7,7*1) , 16 (1*16,2*8,4*4,8*2,16*1) -> we just chekcking that 2*8

      
        for(int i=1;i<=t;i++){

            int n = sc.nextInt();
             int count = 0;
            for(int j=2;j*j<n;j++){
                 if(n%j==0){
                    count++;
                    break;
                 }
            }
            if(count==0){
                System.out.println("Prime");
            }
            else{
                System.out.println("not Prime");
            }
        }

        sc.close();
    }
    
}
