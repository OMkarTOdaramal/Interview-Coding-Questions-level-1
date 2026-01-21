public class Main {

    public static int secondLargest(int[] arr){

        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE; 

        for(int i=0;i<arr.length;i++){

            if(arr[i]>largest){
                sec_largest = largest;
                largest = arr[i];
            }
            else if(arr[i]>sec_largest){
                sec_largest = arr[i];
            }

        }

        return sec_largest;
    }

    public static void main(String[] args) {

        int[] arr = {4,3,5,7,6,2,8,1};

        int second_largest = secondLargest(arr);
        System.out.println(second_largest);
    }
    
}
