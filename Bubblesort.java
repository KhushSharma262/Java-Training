import java.util.Arrays;

class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {12,12,4,45,65,3,53,57,86,32,64,7};
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){
                int t = arr[j];
                arr[j] = arr[j+1];
                arr[j + 1] = t;
            }
            }  
        }
        System.out.println(Arrays.toString(arr));
    }   
}
