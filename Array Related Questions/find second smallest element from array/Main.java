public class Main {

    public static int secondSmallest(int[] arr){

        int smallest = Integer.MAX_VALUE;
        int sec_smallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]<smallest){
                sec_smallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<sec_smallest){
                sec_smallest = arr[i];
            }
        }

        return sec_smallest;
    }

    public static void main(String[] args) {
        
        int[] arr = {4,3,6,2,8,7,1,9};

        int second_smallest = secondSmallest(arr);
        System.out.println(second_smallest);
    }
    
}
