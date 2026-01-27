public class Main {

    public static void bubbleSort(int[] arr,int n){

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {3,5,2,6,1,8,3};
        int n = arr.length;

        bubbleSort(arr, n);
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
    
}
