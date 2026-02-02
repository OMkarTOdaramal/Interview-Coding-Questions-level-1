public class Main {

    public static void selectionSort(int[] arr, int n){

        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {3,2,6,4,1,8,4,1,9,7};
        int n = arr.length;

        for(int i:arr){
            System.out.print(i + " ");
        }

        System.out.println();
        selectionSort(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
