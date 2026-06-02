import java.util.*;

class NumberGuessing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int low = 1;
        int high = 50;
        while (low <= high){
            int a = low  + (high - low)/2;
            System.out.println("Number Guessing Game");
            System.out.println("Is it " + a);
            String y = sc.next();
            if (y.equals("higher")){
                low = a + 1;
            }
            else if (y.equals("lower")){
                high = a -1;
                
            }
            else{
                System.out.println("you got your no");
                System.out.println("is " + a );
                break;
            }

        }
    }
}