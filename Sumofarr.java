import java.util.*;

class Sumofarr{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Arr");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int j = 0; j < n; j++){
            System.out.println("Enter " + (j+1) + "th element of arr");
            Scanner sc1 = new Scanner(System.in);
            int y = sc1.nextInt();
            
            arr[j] = y;
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i ++){
            sum += arr[i];
        }
        System.out.println("The sum of the arr will be:");
        System.out.print(sum);
    }
}   