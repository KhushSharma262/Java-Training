import java.util.Scanner;

class Inputoutput{
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if (y < 18){
        System.out.println("Minor");
    }
    else if (y >= 55){
        System.out.println("Senior Citizen");
    }
    else{
        System.out.println("Adult");
    }

}
}

    