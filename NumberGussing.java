import java.util.*;

class NumberGuessing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int low = 1;
        int high = 50;
        while (low < high){
            int a = (high - low)/2;
            System.out.println("Number Guessing Game");
            System.out.println("Is it" + a);
            String y = sc.next();
            if (y == "higher"){
                System.out.println("is your no." + ((high - low)/2) );
                low = a;
            }
            else if (y == "lower"){
                high = a;
                System.out.println("is your no." + ((high - low)/2) );
            }
            else{
                System.out.println("you got your no");
            }

        }
    }
}