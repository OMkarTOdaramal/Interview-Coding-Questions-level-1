import java.util.*;
public class Main {

    public static int removeDuplicates(int[] arr,int n){

        // This logic only works for sorted arrays 
        // so if array is not sorted sort it first
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[n-1];
        j++;

        return j;
    }
    public static void main(String[] args) {
        
        int[] arr = {2,1,6,3,1,1,2,5,9,1,8};
        
        Arrays.sort(arr);
        int n = arr.length;

        n = removeDuplicates(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
