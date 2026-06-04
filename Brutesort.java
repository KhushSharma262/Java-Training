import java.util.Arrays;

class Brutesort {
    public static void main(String[] args) {
        int[] arr = {12,4,24,1,2,52,5,68,523,255,864,3};
        int n = arr.length;
        int[] brr = new int[n];
        
        for (int i = 0; i < n; i ++){
            int low = arr[i];
            for (int j = 0; j < n; j++){
                if (low > arr[j]){
                    low = arr[j];
                }
            }
            brr[i] = low;
        }
        System.out.println(Arrays.toString(brr));
}
    }   
