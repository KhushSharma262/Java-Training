import java.util.Arrays;

class Selectionsort {
    public static void main(String[] args) {
        int [] arr = {12,342,23,53,121,4,35,3,6};
        int n = arr.length;

        for (int i = 0; i < n; i ++){
            int low = arr[i];
            for(int j = i; j < n; j++){
                if (low > arr[j]){
                    int t = low;
                    low = arr[j];
                    arr[j] = t;
                }
            }
            arr[i] = low;
        }
        System.out.println(Arrays.toString(arr));
    }
} 