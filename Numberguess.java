import java.util.*;

class Numberguess{
    public static void main(String[] args){
        Random rd = new Random();
        int number = rd.nextInt(50) +1;
        int guess = -1;
        while(guess != number){
            System.out.println("Guess the number");
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();
            if (guess < number){
                System.out.println("Higher");}

            else if(guess > number){
                System.out.println("Lower");
            }

            else{
                System.out.println("You Got that");
            }
        }
        }
    }
