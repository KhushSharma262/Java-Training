import java.util.*;

class Binarysearch {
    public static void main(String[] args)
    {
    int[] arr = {1,23,12,564,13,545,15,45,65,152,98,65};
    int l = 0;
    int n = arr.length;
    int tar = 1;
    int r = n-1;
    Arrays.sort(arr);

    while(true){
        int mid = (r+l)/2;
        if (arr[mid] == tar)
        {
            System.out.println(mid + 1);
            break;
        
        }
        else if (arr[mid] < tar){
            l = mid;
        }
        else if (arr[mid] > tar){
            r = mid;
        }
        
    }
    
    }
}
