import java.util.*;

class Runningsumofarr {
    public static void main(String[] args){
    int[] arr = {5, 8, 1, 2, 4};
    int a = 0;
    int[] brr = new int[arr.length];

    for (int i = 0; i < arr.length; i++){
        a += arr[i];
        brr[i] = a;
    }

    System.out.println(Arrays.toString(brr));
}
}
