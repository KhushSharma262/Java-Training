import java.util.*;

class Reversearr{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int[] brr = new int[n];
        int count = 0;

        for(int i = n-1; i >= 0; i--){
            brr[count] = arr[i];
            count += 1;
        }

        System.out.println(Arrays.toString(brr));

    }
}