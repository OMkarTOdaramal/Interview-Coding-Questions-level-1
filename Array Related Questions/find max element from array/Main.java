public class Main {
    public static void main(String[] args) {
        
        int[] arr = {12,23,9,11,65,22,10,3,5,6};

        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    
}
