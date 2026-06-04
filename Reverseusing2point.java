import java.util.*;

class Reverseusing2point{
    public static void main(String[] args) {
        
    
    int[] arr = {1,2,3,4,5,6};
    int n = arr.length;
    int left = 0;
    int right = n-1;
    int temp = 0;

    while(left < right){
        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;

    }
    System.out.println(Arrays.toString(arr));
}
}